/*
    Programa para adicionar nomes utilizando um ArrayList:
    ● Receba os nomes até que FIM seja digitado;
    ● Mostre a lista de nomes;
 */

import java.util.ArrayList;
import java.util.Scanner;

public class NomesArrayList {
    public static void main(String[] args) {

        // Criamos um ArrayList -> lista de nomes
        ArrayList<String> listaNomes = new ArrayList<>();

        // Estanciamos o Scanner para para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // imprimir mensagem no console
        System.out.println("Digite os nomes (digite 'FIM' para parar):");

        // Estrutura de repetição while
        while (true) {
            // Atribui valor para variável
            String nome = scanner.nextLine();

            // Estrutura de decisão para determinar se fim ou alimentar a lista
            if (nome.equalsIgnoreCase("FIM")) {
                break;
            } else {
                //Adiciona o nome a lista
                listaNomes.add(nome);
            }
        }

        System.out.println("Lista de nomes:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}