package co.com.automation.utils;

public class TimeClass {
    private TimeClass(){}
    public static void tiempoEspera(int tiempo){
        try {
            Thread.sleep(tiempo*1000L);
        }catch (InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

    }
}
