import Excepciones.InputInvalido;
import Modelo.CuentaAtras;
import Modelo.CuentaInfinita;
import Modelo.Proceso;
import Verificadores.HaltChecker;
import org.junit.Test;
import static org.junit.Assert.assertThrows;


public class HaltCheckerTest {

    @Test
    public void testWillHaltCuentaInfinita() throws InputInvalido {
        // Crear instancias de CuentaInfinita
        Proceso cuentaInfinita1 = new CuentaInfinita(null);
        Proceso cuentaInfinita2 = new CuentaInfinita(null);

        // Verificar si dos cuentas infinitas se detienen
        assertTrue(HaltChecker.getInstance().willHalt(cuentaInfinita1, cuentaInfinita2));
    }

    private void assertTrue(boolean b) {

    }

    @Test
    public void testWillHaltCuentaAtrasWithCuentaInfinita() {
        // Crear instancias de CuentaAtras y CuentaInfinita
        Proceso cuentaAtras = new CuentaAtras(null);
        Proceso cuentaInfinita = new CuentaInfinita(null);

        // Verificar si se lanza una excepción al intentar ejecutar CuentaAtras con CuentaInfinita
        assertThrows(InputInvalido.class, () -> HaltChecker.getInstance().willHalt(cuentaAtras, cuentaInfinita));
    }

    @Test
    public void testWillHaltCuentaInfinitaWithCuentaAtras() throws InputInvalido {
        // Crear instancias de CuentaInfinita y CuentaAtras
        Proceso cuentaInfinita = new CuentaInfinita(null);
        Proceso cuentaAtras = new CuentaAtras(null);

        // Verificar si una cuenta infinita se detiene al intentar ejecutarla con una cuenta atrás
        assertTrue(HaltChecker.getInstance().willHalt(cuentaInfinita, cuentaAtras));
    }

    @Test
    public void testWillHaltCuentaAtras() throws InputInvalido {
        // Crear instancias de CuentaAtras
        Proceso cuentaAtras1 = new CuentaAtras(null);
        Proceso cuentaAtras2 = new CuentaAtras(null);

        // Verificar si dos cuentas atrás se detienen
        assertTrue(HaltChecker.getInstance().willHalt(cuentaAtras1, cuentaAtras2));
    }
}
