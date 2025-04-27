package co.com.automation.task;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Visibility;
import net.thucydides.core.util.EnvironmentVariables;
import static co.com.automation.ui.HomePage.*;
import static co.com.automation.utils.ConstantClass.PASSWORD;
import static co.com.automation.utils.ConstantClass.USERNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginClass implements Task {
    protected String userName;
    private EnvironmentVariables environmentVariables;
    protected String passUser;
    public LoginClass(String userName, String passUser){
        this.userName= userName;
        this.passUser= passUser;
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        String user= EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(USERNAME);
        String password = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(PASSWORD);
        boolean imagenPrueba= Visibility.of(LOGO_ORANGE).answeredBy(actor);
        if (imagenPrueba) {
            actor.wasAbleTo(
                    Enter.theValue(user).into(LBL_USER),
                    Enter.theValue(password).into(LBL_PASSWORD),
                    Click.on(BTN_LOGIN)
            );
        } else{
            throw new RuntimeException("No se encontró el elemento, finaliza la automatización");
        }
    }
    public static Performable loginUser(String userName, String passUser){
        return instrumented(LoginClass.class, userName, passUser);
    }
}
