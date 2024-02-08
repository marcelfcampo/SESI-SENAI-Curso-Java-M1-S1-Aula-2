/*
Armazene as instâncias de Pessoa em uma lista e depois percorra a lista para verificar
quem é maior de idade e quem é menor de idade.
Exemplo de saída no console: “André é menor de idade.”
 */

import java.util.ArrayList;
import java.util.List;

public class Pessoa2 {
    private String nome;
    private int idade;

    public Pessoa2(String nome, int idade) {
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

    public static void main(String[] args) {
        List<Pessoa2> listaPessoas = new ArrayList<>();

        // Instanciando três objetos da classe Pessoa com valores diferentes
        Pessoa2 pessoa1 = new Pessoa2("Alice", 25);
        Pessoa2 pessoa2 = new Pessoa2("Andre", 17);
        Pessoa2 pessoa3 = new Pessoa2("Carol", 22);

        // Adicionando as pessoas à lista
        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);

        // Verificando quem é maior e quem é menor de idade na lista
        for (Pessoa2 pessoa : listaPessoas) {
            if (pessoa.getIdade() >= 18) {
                System.out.println(pessoa.getNome() + " é maior de idade.");
            } else {
                System.out.println(pessoa.getNome() + " é menor de idade.");
            }
        }
    }
}

/*
Neste exemplo, instanciamos três objetos Pessoa e os adicionamos à lista listaPessoas.
Em seguida, percorremos essa lista utilizando um loop for-each para verificar a idade
de cada pessoa.
Se a idade for maior ou igual a 18, é exibida a mensagem de que a pessoa é maior de idade;
caso contrário, é exibida a mensagem de que a pessoa é menor de idade.

Exemplo de saída no console: “André é menor de idade.”
 */