import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {
    Autor autor = new Autor("Jess", "Brasileira");
    Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
    Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

    @Test
    public void testGetTitulo() {
        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals("Java Avançado", livro2.getTitulo());
    }

    @Test
    public void testGetAutor() {
        assertEquals(autor, livro1.getAutor());
        assertEquals(autor, livro2.getAutor());
    }

    @Test
    public void testGetCategoria() {
        assertEquals("tecnologia", livro1.getCategoria());
        assertEquals("tecnologia", livro2.getCategoria());
    }

    @Test
    public void testIsDisponivel() {
        assertTrue(livro1.isDisponivel());
        assertFalse(livro2.isDisponivel());
    }

    @Test
    public void testSetDisponivel() {
        livro2.setDisponivel(true);
        assertTrue(livro2.isDisponivel());
        livro1.setDisponivel(false);
        assertFalse(livro1.isDisponivel());
    }

    @Test
    public void testToString() {
        String expected1 = "Livro{titulo='Java Basico', autor=Autor{nome='Jess', nacionalidade='Brasileira'}, categoria='tecnologia', disponivel=true}";
        assertEquals(expected1, livro1.toString());

        String expected2 = "Livro{titulo='Java Avançado', autor=Autor{nome='Jess', nacionalidade='Brasileira'}, categoria='tecnologia', disponivel=false}";
        assertEquals(expected2, livro2.toString());
    }

    @Test
    public void testEquals() {
        Livro livro3 = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals(livro1, livro3);
        assertNotEquals(livro1, livro2);
    }

    @Test
    public void testHashCode() {
        Livro livro3 = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals(livro1.hashCode(), livro3.hashCode());
        assertNotEquals(livro1.hashCode(), livro2.hashCode());
    }
}