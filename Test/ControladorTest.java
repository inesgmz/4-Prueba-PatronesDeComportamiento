import Controlador.Controlador;
import org.junit.Test;
import Vista.Vista;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


public class ControladorTest {

    @Test
    public void testIncrementCount() throws NoSuchMethodException {
        // Crear una instancia de Vista para simular la interfaz de usuario en el test
        Vista vista = new Vista(null);
        // Crear una instancia de Controlador
        Controlador controlador = new Controlador(vista);

        // Incrementar el contador
        controlador.incrementCount();

        // Verificar si el contador se incrementó correctamente
        assertEquals(1, controlador.getClass().getConstructor());
    }

    @Test
    public void testStartCuentaInfinita() {
        // Crear una instancia de Vista para simular la interfaz de usuario en el test
        Vista vista = new Vista(null);
        // Crear una instancia de Controlador
        Controlador controlador = new Controlador(vista);

        // Verificar si la cuenta infinita se inicia sin lanzar excepciones
        assertDoesNotThrow(() -> controlador.startCuentaInfinita());
    }

    @Test
    public void testStartCuentaAtras() {
        // Crear una instancia de Vista para simular la interfaz de usuario en el test
        Vista vista = new Vista(null);
        // Crear una instancia de Controlador
        Controlador controlador = new Controlador(vista);

        // Verificar si la cuenta atrás se inicia sin lanzar excepciones
        assertDoesNotThrow(() -> controlador.startCuentaAtras());
    }

    @Test
    public void testStopCuentaAtras() {
        // Crear una instancia de Vista para simular la interfaz de usuario en el test
        Vista vista = new Vista(null);
        // Crear una instancia de Controlador
        Controlador controlador = new Controlador(vista);

        // Verificar si se puede detener la cuenta atrás sin lanzar excepciones
        assertDoesNotThrow(() -> controlador.stopCuentaAtras());
    }
}
