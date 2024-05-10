import Controlador.*;
import Excepciones.InputInvalido;
import Modelo.*;
import Verificadores.HaltChecker;
import Vista.Vista;


public class Main {
    public static void main(String[] args) {
        try {
            Controlador controlador = new Controlador();
            Vista vista = new Vista(controlador);
            // Crear una instancia de Reverser
            Reverser reverser = new Reverser();
            // Crear instancias de CuentaAtras y CuentaInfinita
            Proceso cuentaAtras = new CuentaAtras(vista);
            Proceso cuentaInfinita = new CuentaInfinita(vista);
            // Crear una instancia de HaltChecker
            HaltChecker haltChecker = HaltChecker.getInstance();

            // Utilizar HaltChecker para verificar si los procesos se detendrán
            boolean willHalt1 = haltChecker.willHalt(cuentaAtras, cuentaInfinita);
            System.out.println("Will halt (CuentaAtras, CuentaInfinita): " + willHalt1);

            boolean willHalt2 = haltChecker.willHalt(cuentaInfinita, cuentaAtras);
            System.out.println("Will halt (CuentaInfinita, CuentaAtras): " + willHalt2);

            // Utilizar Reverser para ejecutar un programa
            reverser.execute();

            while (true) {
                System.out.println("Este es un bucle infinito");
            }

        } catch (InputInvalido e) {
            System.out.println(e.getMessage());
        }
    }
}
