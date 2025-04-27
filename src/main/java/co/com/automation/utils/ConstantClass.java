package co.com.automation.utils;

public class ConstantClass {

    public final static String WEB_URL= "environments.default.webdriver.base.url";
    public final static String USERNAME= "credentials.default.user.name";
    public final static String PASSWORD= "credentials.default.pass";
    public final static int NUMBER = 5;
    public final static String RESUMEFILE= System.getProperty("user.dir") + "./src/test/resources/files/Pruebas automatizadas.pdf";
    private ConstantClass(){
        throw new IllegalStateException("No instanciar");
    }
}
