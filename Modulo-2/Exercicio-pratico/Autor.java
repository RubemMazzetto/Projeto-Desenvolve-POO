public class Autor extends Pessoa {
    private String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getObrasPublicadas() {
        return "N/A"; // Placeholder, pode ser expandido para listar livros
    }

    public String getObrasPublicadasPorGenero(String genero) {
        return "N/A"; // Placeholder, pode ser expandido para filtrar por gênero
    }
}