import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {
    Autor autor1 = new Autor("Jess", "Brasileira");
    Autor autor2 = new Autor("Alan Turing", "Inglês");

    @Test
    public void testGetNome() {
        assertEquals("Jess", autor1.getNome());
        assertEquals("Alan Turing", autor2.getNome());
    }

    @Test
    public void testGetNacionalidade() {
        assertEquals("Brasileira", autor1.getNacionalidade());
        assertEquals("Inglês", autor2.getNacionalidade());
    }

    @Test
    public void testToString() {
        String expected1 = "Autor{nome='Jess', nacionalidade='Brasileira'}";
        assertEquals(expected1, autor1.toString());

        String expected2 = "Autor{nome='Alan Turing', nacionalidade='Inglês'}";
        assertEquals(expected2, autor2.toString());
    }

    @Test
    public void testEquals() {
        Autor autor3 = new Autor("Jess", "Brasileira");
        assertEquals(autor1, autor3);
        assertNotEquals(autor1, autor2);
    }

    @Test
    public void testHashCode() {
        Autor autor3 = new Autor("Jess", "Brasileira");
        assertEquals(autor1.hashCode(), autor3.hashCode());
        assertNotEquals(autor1.hashCode(), autor2.hashCode());
    }
}