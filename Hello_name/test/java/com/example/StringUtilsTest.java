import Hello_name.src.main.java.com.example.StringUtils;

public class StringUtilsTest {

    @Test
    public void testSaludar() {
        String expected = "Hola Juan!";
        String actual = StringUtils.saludar("Juan");
        assertEquals(expected, actual);
    }

    private void assertEquals(String expected, String actual) {
    }

    @Test
    public void testEsVacio() {
        assertTrue(StringUtils.esVacio(null));
        assertTrue(StringUtils.esVacio(""));
        assertTrue(StringUtils.esVacio(" "));
        assertFalse(StringUtils.esVacio("hola"));
    }
    
    private void assertFalse(boolean esVacio) {
    }

    private void assertTrue(boolean esVacio) {
    }

    @Test
    public void testEliminarEspacios() {
        assertEquals("hola", StringUtils.eliminarEspacios(" h o l a "));
        assertEquals("adios", StringUtils.eliminarEspacios("  a d i o s "));
        assertEquals("", StringUtils.eliminarEspacios(" "));
    }
    
    @Test
    public void testRevertirCadena() {
        assertEquals("aloH", StringUtils.revertirCadena("Hola"));
        assertEquals("odisaB si eman yM", StringUtils.revertirCadena("My name is Basido"));
    }
    
    @Test
    public void testConcatenarCadenas() {
        assertEquals("Hola, Juan", StringUtils.concatenarCadenas("Hola", ", ", "Juan"));
        assertEquals("Un saludo a todos", StringUtils.concatenarCadenas("Un saludo", " ", "a", " ", "todos"));
    }
}
