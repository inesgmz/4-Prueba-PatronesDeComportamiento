package Modelo;
import Vista.*;
import java.lang.*;

public class CuentaInfinita implements Proceso {
    private Vista vista;
    private int count = 0;

    public CuentaInfinita(Vista vista) {
        this.vista = vista;
    }


    @Override
    public int execute() throws InterruptedException {
        while (true) {
            System.out.println("Cuenta infinita:" + count);
            count++;
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }

        return 0;
    }

    @Override
    public void stop() {
        System.out.println("Se ha detenido la cuenta infinita");
    }

}
