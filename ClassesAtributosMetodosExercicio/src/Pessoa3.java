import java.util.ArrayList;
import java.util.List;

public class Pessoa3 {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para verificar se a pessoa é maior de idade
    public void verificarMaiorIdade(Pessoa pessoa) {
        if (pessoa.getIdade() >= 18) {
            System.out.println(pessoa.getNome() + " é maior de idade.");
        } else {
            System.out.println(pessoa.getNome() + " é menor de idade.");
        }
    }

    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Alice", 25);
        Pessoa pessoa2 = new Pessoa("Bob", 17);
        Pessoa pessoa3 = new Pessoa("Carol", 22);

        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);

        // Percorrendo a lista e chamando o método verificarMaiorIdade para cada pessoa
        for (Pessoa pessoa : listaPessoas) {
            pessoa.verificarMaiorIdade(pessoa);
        }
    }
}