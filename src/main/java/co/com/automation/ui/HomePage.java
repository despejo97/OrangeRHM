package co.com.automation.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    private HomePage(){

    }
    public static final Target LOGO_ORANGE= Target.the("Imagen de incio").locatedBy("//div/div/div/img[@src=\"/web/images/ohrm_branding.png?v=1721393199309\"]");
    public static final Target LBL_USER = Target.the("Label de usuario").locatedBy("//div/input[@placeholder= \"Username\"]");
    public static final Target LBL_PASSWORD = Target.the("Label de contraseña").locatedBy("//div/input[@placeholder=\"Password\"]");
    public static final Target BTN_LOGIN= Target.the("Botón para iniciar sesión").locatedBy("//div/button[@type=\"submit\"]");
    public static final Target IMG_ORANGE= Target.the("Imagen principal").locatedBy("//div/a/div/img[@src=\"/web/images/orangehrm-logo.png?v=1721393199309\"]");
    public static final Target BTN_RECRUITMENT= Target.the("Botón para ir al apartado de reclutamiento").locatedBy("//a[@href=\"/web/index.php/recruitment/viewRecruitmentModule\"]");
    public static final Target BTN_ADD= Target.the("Botón para agregar").locatedBy("//div/div/button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");
    public static final Target LBL_FIRSTNAME= Target.the("Label de primer nombre").locatedBy("//div/input[@name=\"firstName\"]");
    public static final Target LBL_MIDDLENAME= Target.the("Label de segundo nombre").locatedBy("//div/input[@name=\"middleName\"]");
    public static final Target LBL_LASTNAME = Target.the("Label de apellido").locatedBy("//div/input[@name=\"lastName\"]");
    public static final Target LBL_EMAIL = Target.the("Label de email").locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]");
    public static final Target LBL_NUMBERPHONE= Target.the("Label de teléfono").locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/input[1]");
    public static final Target INPUT_RESUME= Target.the("Elemento para subir el archivo").locatedBy("//div/input[@type=\"file\"]");
    public static final Target LBL_KEYWORD = Target.the("Elemento para colocar una palabra clave o adicional").locatedBy("//div/input[@placeholder=\"Enter comma seperated words...\"]");
    public static final Target LBL_NOTES = Target.the("Elemento para colocar una nota adicional").locatedBy("//div/textarea[@placeholder=\"Type here\"]");
    public static final Target BTN_SAVE = Target.the("Botón para guardar la vacante").locatedBy("//div/button[@type=\"submit\"]");
    public static final Target OPTIONS= Target.the("Click para desplegar las opciones del select").locatedBy("//div/div/div/i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]");
    public static final Target OPTIONQA= Target.the("Opción QA lead").locatedBy("//div/div/div[contains(text(),'Senior QA Lead')]");



}
