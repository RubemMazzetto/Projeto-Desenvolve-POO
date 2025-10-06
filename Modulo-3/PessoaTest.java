import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {
    Pessoa pessoa1 = new Pessoa("Gabriel", 21);
    Pessoa pessoa2 = new Pessoa("Maria", 25);

    @Test
    public void testGetNome() {
        assertEquals("Gabriel", pessoa1.getNome());
        assertEquals("Maria", pessoa2.getNome());
    }

    @Test
    public void testGetIdade() {
        assertEquals(21, pessoa1.getIdade());
        assertEquals(25, pessoa2.getIdade());
    }

    @Test
    public void testToString() {
        String expected1 = "Pessoa{nome='Gabriel', idade=21}";
        assertEquals(expected1, pessoa1.toString());

        String expected2 = "Pessoa{nome='Maria', idade=25}";
        assertEquals(expected2, pessoa2.toString());
    }

    @Test
    public void testEquals() {
        Pessoa pessoa3 = new Pessoa("Gabriel", 21);
        assertEquals(pessoa1, pessoa3);
        assertNotEquals(pessoa1, pessoa2);
    }

    @Test
    public void testHashCode() {
        Pessoa pessoa3 = new Pessoa("Gabriel", 21);
        assertEquals(pessoa1.hashCode(), pessoa3.hashCode());
        assertNotEquals(pessoa1.hashCode(), pessoa2.hashCode());
    }
}