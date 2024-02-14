/*
[M1S01] Ex 6 - Calculando média
Escreva um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
No final informar o nome do aluno e a sua média ponderada.
Dados:
	A primeira prova tem peso 3.
	A segunda prova tem peso 6.
	A terceira prova tem peso 9.

    Média Aritmética Ponderada: medida de tendência central
	É igual a soma dos valores vezes os pesos. Dividido pela soma dos pesos

Fórmula da média ponderada:
(n1 * p1)+(n2*p2)+(n3*p3)/somatório das notas
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Para que seja possível a leitura utilizamos o Scanner
        Scanner entrada = new Scanner(System.in);

        // Variáveis
        String nome;
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double media;


        // Solicita ao usuário para digitar o nome
        System.out.println("Nome do aluno: ");
        nome = entrada.next();

        // Solicita ao usuário para digitar a primeira nota
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();

        // Solicita ao usuário para digitar a segunda nota
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();

        // Solicita ao usuário para digitar a terceira nota
        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();

        //Fórmula da média ponderada: (n1 * p1)+(n2*p2)+(n3*p3)/somatório das notas
        media = ((nota1 * 3)+(nota2 * 6)+(nota3 * 9))/(nota1 + nota2 + nota3);


        System.out.println(nome+" obteve média ponderada de: "+media);

        entrada.close();



    }
}