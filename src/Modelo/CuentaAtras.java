package Modelo;
import Vista.*;

public class CuentaAtras implements Proceso {
    private Vista vista;

    public CuentaAtras(Vista vista) {
        this.vista = vista;
    }



    @Override
    public int execute() {
        int count = 10;
        while (count >= 0) {
            String mensaje = "Cuenta atrás: " + count;
            vista.mostrar(count);
            count--;
        }
        return count;
    }

    @Override
    public void stop() {

    }
}
