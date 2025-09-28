
public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Alice");


        Usuario usuario = new Usuario();

        usuario.imprimirNomeAluno(pessoa);

    }


    static class Pessoa {

        private String nome;


        public String getNome() {

            return this.nome;

        }


        public void setNome(String nome) {

            this.nome = nome;

        }

    }


    static class Usuario {

        public void imprimirNomeAluno(Pessoa aluno) {

            System.out.println("Nome do aluno: " + aluno.getNome());

        }

    }

}