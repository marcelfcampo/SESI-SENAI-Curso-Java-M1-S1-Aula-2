
/*
Em Java, atributos referem-se às características ou propriedades de uma classe. Eles
são semelhantes às variáveis no sentido de que armazenam dados, mas estão diretamente
associados a objetos de uma classe específica.

Em termos conceituais, pode-se dizer que os atributos de uma classe são variáveis
que descrevem o estado ou as características dos objetos dessa classe.

As variáveis em Java são reservadas de memória que contêm dados que podem ser modificados
durante a execução do programa. Por outro lado, os atributos são variáveis declaradas dentro
de uma classe e definem os dados que cada objeto dessa classe pode conter.

Cada objeto terá seus próprios valores para esses atributos.

Os atributos são definidos usando a palavra-chave private, public, protected ou default
(sem especificar nenhum modificador de acesso, o que torna o atributo acessível apenas
dentro do mesmo pacote) seguida pelo tipo de dado e o nome do atributo. Por exemplo:
 */


public class Pessoa {
    public static void main(String[] args) {

        private String nome;    // atributo idade
        private int idade;      //atributo idade

        // outros membros e métodos da classe Pessoa

    }
}

/*
Nesse exemplo, nome e idade são atributos da classe Pessoa.
Cada objeto da classe Pessoa terá sua própria cópia desses atributos.

Portanto, enquanto os atributos podem ser considerados como variáveis
dentro de uma classe, eles são mais específicos, representando os dados
que caracterizam um objeto particular dessa classe.
 */