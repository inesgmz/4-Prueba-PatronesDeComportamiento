import Modelo.Modelo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ModeloTest {

    @Test
    public void testGetCount() {
        // Crear una instancia de Modelo
        Modelo modelo = new Modelo();
        // Establecer un valor para count
        modelo.setCount(10);
        // Verificar si getCount devuelve el valor esperado
        assertEquals(10, modelo.getCount());
    }

    @Test
    public void testSetCount() {
        // Crear una instancia de Modelo
        Modelo modelo = new Modelo();
        // Establecer un valor para count
        modelo.setCount(5);
        // Verificar si setCount actualiza el valor correctamente
        assertEquals(5, modelo.getCount());
    }
}
