package co.com.automation.stepdefinitions;
import co.com.automation.hook.WebClass;
import co.com.automation.task.LoginClass;
import co.com.automation.task.RegisterClass;
import co.com.automation.task.RegistroVacanteClass;
import co.com.automation.utils.TimeClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepClass {

    @Before
    public static void setUser(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("{string} Ingresa a la URL")
    public void ingresaALaURL(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
          WebClass.browseWeb()
        );
        TimeClass.tiempoEspera(5);
    }

    @And("Diligencia sus datos de ingreso {string}, {string}")
    public void diligenciaSusDatosDeIngreso(String user, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginClass.loginUser(user,password)
        );
    }

    @When("Le dé clic en la opción de registro")
   public void leDeClicEnLaOpcionDeRegistro() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegisterClass.registroVacante()
        );
   }

    @Then("Debe de aparecer el formulario de registro y realiza el registro de una vacante con los datos {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void debeDeAparecerElFormularioDeRegistroYRealizaElRegistroDeUnaVacanteConLosDatos(String nombre, String segundoNombre, String apellido, String correo, String telefono, String nota, String mensaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistroVacanteClass.registroUsuario(nombre, segundoNombre, apellido, correo, telefono, nota, mensaje)
        );
        TimeClass.tiempoEspera(5);
    }
}
