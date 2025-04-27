package co.com.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.automation.ui.HomePage.*;
import static co.com.automation.utils.ConstantClass.NUMBER;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class RegisterClass implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(IMG_ORANGE,isPresent()).forNoMoreThan(NUMBER).seconds(),
                Click.on(BTN_RECRUITMENT),
                Click.on(BTN_ADD)
        );

    }
    public static Performable registroVacante(){
        return instrumented(RegisterClass.class);
    }
}
