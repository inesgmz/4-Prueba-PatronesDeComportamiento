package Controlador;
import Modelo.Modelo;
import Vista.Vista;
import Modelo.CuentaInfinita;
import Modelo.CuentaAtras;

public class Controlador {
    private Modelo modelo;
    private Vista vista;
    private CuentaInfinita cuentaInfinita;
    private CuentaAtras cuentaAtras;

    public Controlador(Vista vista) {
        this.modelo = new Modelo();
        this.vista = vista;
        this.cuentaInfinita = new CuentaInfinita(vista);
        this.cuentaAtras = new CuentaAtras(vista);
    }

    public Controlador() {

    }

    public void incrementCount() {
        modelo.setCount(modelo.getCount() + 1);
        vista.mostrar(modelo.getCount());
    }

    public void startCuentaInfinita() throws Exception {
        cuentaInfinita.execute();
    }

    public void startCuentaAtras() throws Exception {
        cuentaAtras.execute();
    }
    public void stopCuentaAtras() throws Exception {
        cuentaAtras.stop();
    }


}