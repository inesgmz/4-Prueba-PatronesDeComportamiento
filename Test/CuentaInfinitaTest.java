import Modelo.CuentaInfinita;
import Modelo.Proceso;
import Vista.Vista;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CuentaInfinitaTest {

    @Test
    public void testExecute() throws Exception {
        // Simulamos una vista para el test
        Vista vista = new Vista(null);
        // Creamos una instancia de CuentaInfinita
        Proceso cuentaInfinita = new CuentaInfinita(vista);

        // Ejecutamos el proceso de cuenta infinita
        int result = cuentaInfinita.execute();

        // Verificamos si el proceso de cuenta infinita finaliza correctamente
        assertEquals(0, result);
    }

    @Test
    public void testStop() {
        // Creamos una instancia de CuentaInfinita
        Proceso cuentaInfinita = new CuentaInfinita(null);

        // Detenemos el proceso de cuenta infinita
        cuentaInfinita.stop();

        // Verificamos si el proceso de cuenta infinita se detiene correctamente
        // Aquí puedes implementar una aserción adicional si deseas verificar alguna salida específica.
    }
}
