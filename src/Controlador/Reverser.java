package Controlador;
import Modelo.*;
import Excepciones.InputInvalido;
import Verificadores.HaltChecker;
import Vista.Vista;

public class Reverser implements Proceso {
    private HaltChecker haltChecker;
    private Vista vista;

    public Reverser() {
        this.haltChecker = haltChecker;
        this.vista = vista;
    }

    public void run(String programCode, String programInput) throws InputInvalido {
        if (programCode == null || programInput == null) {
            throw new InputInvalido("Input invalido");
        }
        if (haltChecker.willHalt(programCode)) {
            while (true) {
                vista.actualizarTexto("Este es un bucle infinito");
                // Bucle infinito
            }
        } else {
            vista.actualizarTexto("El programa no entra en un bucle infinito");
            // Termina inmediatamente
            return;
        }
    }

    @Override
    public int execute() {
        try {
            run("programCode", "programInput");
        } catch (InputInvalido e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public void stop() {

    }
}
