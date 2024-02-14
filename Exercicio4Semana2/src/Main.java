/*
[M1S01] Ex 4 - Calculando autonomia de combustível
Escreva um programa em Java para determinar o consumo médio de um automóvel sendo fornecida a distância total
percorrida pelo automóvel e o total de combustível gasto.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //variáveis do tipo double
        double distancia, qtdLitros, media;

        // Para que seja possível a leitura utilizamos o Scanner
        Scanner teclado = new Scanner(System.in);

        // Informar distância percorrida pelo automóvel
        System.out.println("Favor, informe a distancia total percorrida: ");
        distancia = teclado.nextDouble(); // Atribuindo valor à variável double através da entrada do usuário

        // Informar o total de combustível gasto
        System.out.println("Favor, informe o total em litros de combustível gasto: ");
        qtdLitros = teclado.nextDouble(); // Atribuindo valor à variável double através da entrada do usuário

        media = (distancia/qtdLitros);
        System.out.println("O consumo médio do automóvel foi: " + media);

    }
}