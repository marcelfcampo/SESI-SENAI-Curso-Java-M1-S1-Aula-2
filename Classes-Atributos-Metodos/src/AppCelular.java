import java.util.ArrayList;

public class AppCelular {

    public static void main(String[] args) {

        // // Criar um objeto do tipo Celular (classe) - instância do objeto
        Celular celular = new Celular();

        /*
        Atributos de uma classe são variáveis que descrevem o estado ou as características dos
        objetos dessa classe.
         */
        celular.modelo = "iPhone 14";
        celular.tamanhoTela = 7.5;
        celular.armazenamento = 128;        //Gigabytes
        celular.memoria = 8;                //Gigabytes
        celular.processador = "A14-Bionic";

        // Criar um ArrayList para armazenar objetos do tipo Celular
        ArrayList<Celular> listaCelulares = new ArrayList<>();

        // Adicionar o objeto 'celular' à lista de celulares
        listaCelulares.add(celular);

        // Exemplo de como percorrer a lista e acessar informações dos celulares
        for (Celular c : listaCelulares) {
            System.out.println("Modelo: " + c.modelo);
            System.out.println("Tamanho da Tela: " + c.tamanhoTela + " polegadas");
            System.out.println("Armazenamento: " + c.armazenamento + " GB");
            System.out.println("Memória: " + c.memoria + " GB");
            System.out.println("Processador: " + c.processador);
        }
    }
}


/*
Celular celular = new Celular(); -> cria uma instância (ou objeto) da classe Celular em Java.
Esse tipo de declaração e inicialização é comum ao se criar objetos em Java.

Aqui está uma explicação detalhada do código fornecido:

// Criar um objeto do tipo Celular (classe) - Isso é a declaração e inicialização de um objeto

    Celular celular = new Celular();

    Neste trecho de código:

Celular é o nome da classe que está sendo instanciada para criar um objeto.
celular é o nome da variável que armazena a referência para o objeto que está sendo criado.

new Celular() é a instrução que realmente cria o objeto.
O operador new aloca memória para um novo objeto do tipo Celular. A palavra-chave new é usada para
criar instâncias de classes em Java. Nesse caso específico, new Celular() está chamando o construtor
padrão da classe Celular para inicializar o objeto.

Depois de executar esse trecho de código, a variável celular conterá uma referência para um novo
objeto do tipo Celular na memória, e você poderá acessar os métodos e atributos dessa instância
usando a variável celular.

Por exemplo, suponha que a classe Celular tenha um método chamado fazerLigacao().
Você poderia chamá-lo assim:

celular.fazerLigacao();

Isso iria executar o método fazerLigacao() no objeto representado pela variável celular.


Neste exemplo, é criado um objeto celular do tipo Celular e definidos valores para seus atributos.
Em seguida, é criado um ArrayList chamado listaCelulares para armazenar objetos do tipo Celular.
O objeto celular é adicionado à lista e, posteriormente, é percorrida essa lista para acessar e
imprimir informações sobre cada objeto Celular contido nela.
 */