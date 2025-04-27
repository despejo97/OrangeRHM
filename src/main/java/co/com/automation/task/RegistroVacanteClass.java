package co.com.automation.task;
import co.com.automation.utils.FakerDataClass;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import java.nio.file.Path;
import static co.com.automation.ui.HomePage.*;
import static co.com.automation.utils.ConstantClass.RESUMEFILE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistroVacanteClass implements Task {
    protected String nombre;
    protected String segundoNombre;
    protected String apellido;
    protected String correo;
    protected String telefono;
    protected String nota;
    protected String mensaje;

    public RegistroVacanteClass(String nombre, String segundoNombre, String apellido, String correo, String telefono, String nota, String mensaje){
        this.nombre= nombre;
        this.segundoNombre = segundoNombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.nota = nota;
        this.mensaje = mensaje;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Enter.theValue(FakerDataClass.generarNombre()).into(LBL_FIRSTNAME),
            Enter.theValue(FakerDataClass.generarSegundoNombre()).into(LBL_MIDDLENAME),
            Enter.theValue(FakerDataClass.generarApellido()).into(LBL_LASTNAME),
            Enter.theValue(FakerDataClass.generarCorreo()).into(LBL_EMAIL),
            Enter.theValue(FakerDataClass.numeroContacto()).into(LBL_NUMBERPHONE),
            Click.on(OPTIONS),
         //   Click.on(OPTIONQA),
            Scroll.to(BTN_SAVE),
            Upload.theFile(Path.of(RESUMEFILE)).to(INPUT_RESUME),
            Enter.theValue(FakerDataClass.generarNombre()).into(LBL_KEYWORD),
            Enter.theValue(FakerDataClass.generarCorreo()).into(LBL_NOTES),
            Click.on(BTN_SAVE)
    );
    }

    public static Performable registroUsuario(String nombre, String segundoNombre, String apellido, String correo, String telefono, String nota, String mensaje){
        return instrumented(RegistroVacanteClass.class, nombre, segundoNombre, apellido, correo, telefono, nota, mensaje);
    }

}
