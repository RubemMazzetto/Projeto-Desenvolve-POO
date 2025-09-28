import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", "Brasileira");

        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");

        Usuario usuario = new Usuario("Lucas Rafael", 25);

        Date dataRetirada = new Date(124, 4, 8, 23, 37, 21);
        Date dataDevolucao = new Date(124, 4, 8, 23, 37, 21);
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        livro.validarDisponibilidade();

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}