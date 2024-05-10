import Controlador.Controlador;
import Vista.Vista;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VistaTest {

    @Test
    public void testMostrar() {
        // Crear una instancia de Controlador (puede ser null ya que no se utiliza en este test)
        Controlador controlador = null;
        // Crear una instancia de Vista
        Vista vista = new Vista(controlador);
        // Mostrar un número en la vista
        vista.mostrar(10);
        // Verificar si el número mostrado es el esperado
        assertEquals("10", vista.getLastShownNumber());
    }

    @Test
    public void testUpdate() {
        // Crear una instancia de Controlador (puede ser null ya que no se utiliza en este test)
        Controlador controlador = null;
        // Crear una instancia de Vista
        Vista vista = new Vista(controlador);
        // Actualizar el mensaje en la vista
        vista.update("Mensaje de prueba");
        // Verificar si el mensaje actualizado es el esperado
        assertEquals("Mensaje de prueba", vista.getLastUpdatedMessage());
    }

    @Test
    public void testActualizarTexto() {
        // Crear una instancia de Controlador (puede ser null ya que no se utiliza en este test)
        Controlador controlador = null;
        // Crear una instancia de Vista
        Vista vista = new Vista(controlador);
        // Actualizar el texto en la vista
        vista.actualizarTexto("Texto de prueba");
        // Verificar si el texto actualizado es el esperado
        assertEquals("Texto de prueba\n", vista.getLastUpdatedMessage());
    }
}
