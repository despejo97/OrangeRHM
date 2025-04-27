package co.com.automation.utils;

import com.github.javafaker.Faker;

public class FakerDataClass {
    private FakerDataClass(){

    }
    private static final Faker faker = new Faker();
    private static int numero = faker.number().numberBetween(300000000,399999999);

    public static String generarNombre(){
        return faker.name().firstName();
    }
    public static String generarSegundoNombre(){
        return faker.name().name();
    }
    public static String generarApellido(){
        return faker.name().lastName();
    }
    public static String generarCorreo(){
        return faker.internet().emailAddress();
    }
    public static String numeroContacto(){
        return String.valueOf(numero);
    }
}
