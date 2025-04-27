package co.com.automation.hook;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import static co.com.automation.utils.ConstantClass.WEB_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WebClass implements Task {
    private EnvironmentVariables environmentVariables;
    @Override
    public <T extends Actor> void performAs(T actor) {
        String url = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(WEB_URL);
        actor.attemptsTo(Open.url(url));
    }
    public static Performable browseWeb(){
        return instrumented(WebClass.class);
    }
}
