import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {
    Usuario usuario1 = new Usuario("Gabriel", 21);
    Usuario usuario2 = new Usuario("Maria", 25);

    @Test
    public void testGetNome() {
        assertEquals("Gabriel", usuario1.getNome());
        assertEquals("Maria", usuario2.getNome());
    }

    @Test
    public void testGetIdade() {
        assertEquals(21, usuario1.getIdade());
        assertEquals(25, usuario2.getIdade());
    }

    @Test
    public void testToString() {
        String expected1 = "Usuario{nome='Gabriel', idade=21}";
        assertEquals(expected1, usuario1.toString());

        String expected2 = "Usuario{nome='Maria', idade=25}";
        assertEquals(expected2, usuario2.toString());
    }

    @Test
    public void testEquals() {
        Usuario usuario3 = new Usuario("Gabriel", 21);
        assertEquals(usuario1, usuario3);
        assertNotEquals(usuario1, usuario2);
    }

    @Test
    public void testHashCode() {
        Usuario usuario3 = new Usuario("Gabriel", 21);
        assertEquals(usuario1.hashCode(), usuario3.hashCode());
        assertNotEquals(usuario1.hashCode(), usuario2.hashCode());
    }
}