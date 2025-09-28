public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean isDisponivel;

    public Livro(String titulo, Autor autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.isDisponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponivel() {
        return isDisponivel;
    }

    public void validarDisponibilidade() {
        if (!isDisponivel) {
            System.out.println("O livro não está disponível");
        }
    }

    public void emprestar() {
        if (isDisponivel) {
            isDisponivel = false;
        }
    }

    public void devolver() {
        isDisponivel = true;
    }
}