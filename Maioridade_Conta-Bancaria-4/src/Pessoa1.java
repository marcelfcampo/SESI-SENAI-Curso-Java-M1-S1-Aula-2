/*
 Implementar a classe Pessoa em Java com os atributos nome e idade,
 e como instanciar três objetos dessa classe com valores diferentes para esses atributos:
 */
public class Pessoa1 {

    private String nome;
    private int idade;

    // Construtor da classe Pessoa
    public Pessoa1(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos para acessar e definir os valores dos atributos (getters e setters)
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

    public static void main(String[] args) {
        // Instanciando três objetos da classe Pessoa com valores diferentes
        Pessoa2 pessoa1 = new Pessoa2("Alice", 25);
        Pessoa2 pessoa2 = new Pessoa2("Bob", 30);
        Pessoa2 pessoa3 = new Pessoa2("Carol", 22);

        // Exibindo informações das três pessoas
        System.out.println("Pessoa 1 - Nome: " + pessoa1.getNome() + ", Idade: " + pessoa1.getIdade());
        System.out.println("Pessoa 2 - Nome: " + pessoa2.getNome() + ", Idade: " + pessoa2.getIdade());
        System.out.println("Pessoa 3 - Nome: " + pessoa3.getNome() + ", Idade: " + pessoa3.getIdade());
    }
}

/*
Neste exemplo, a classe Pessoa possui dois atributos (nome e idade), métodos getters e setters
para acessar e definir esses atributos, e um construtor que permite criar objetos Pessoa com
valores específicos para nome e idade.

No método main, são criados três objetos Pessoa (pessoa1, pessoa2 e pessoa3) com diferentes nomes
e idades. Depois, são exibidas as informações dessas pessoas usando os métodos getNome() e getIdade().
 */