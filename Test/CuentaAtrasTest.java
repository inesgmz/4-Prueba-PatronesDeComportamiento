import Modelo.CuentaAtras;
import Modelo.Proceso;
import Vista.Vista;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CuentaAtrasTest {

    @Test
    public void testExecute() throws Exception {
        // Simulamos una vista para el test
        Vista vista = new Vista(null);
        // Creamos una instancia de CuentaAtras
        Proceso cuentaAtras = new CuentaAtras(vista);
        // Ejecutamos el proceso de cuenta atrás
        cuentaAtras.execute();

        // Verificamos si la vista muestra los números esperados
        assertEquals("10", vista.getLastShownNumber());
        assertEquals("9", vista.getLastShownNumber());
        assertEquals("8", vista.getLastShownNumber());
        // Continuar verificando los números restantes...
    }
}
