import java.util.Arrays;

public class Pessoa {
    private String nome;
    private String[] livros;

    public Pessoa(String nome, String[] livros) {
        this.nome = nome;
        this.livros = livros;
    }

    public String getNome() {
        return nome;
    }

    public String[] getLivros() {
        return livros;
    }

    public static void main(String[] args) {
        String[]                                                                                                                                                                              livros                                                                                                                                                                              =                                                                                                                                                                              {"Arquitetura                                                                                                                                                                              Limpa",                                                                                                                                                                              "Desbravando                                                                                                                                                                              Java",                                                                                                                                                                              "SOLID                                                                                                                                                                              para Ninjas"};
        Pessoa pessoa = new Pessoa("Jess", livros);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Livros: " + Arrays.toString(pessoa.getLivros()));
    }
}