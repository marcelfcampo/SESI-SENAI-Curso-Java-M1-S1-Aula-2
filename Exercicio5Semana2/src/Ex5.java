/*
[M1S01] Ex 5 - Calculando salário
Escreva um programa que leia o nome do vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (valor monetário). Sabendo que este vendedor ganha 12% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e o salário no final do mês.
 */

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        // Para que seja possível a leitura utilizamos o Scanner
        Scanner teclado = new Scanner(System.in);

        // Variáveis
        String nome;
        Double p=0.0, valor = 0.0, salario, salariototal;

        // Solicita ao usuário que digite o nome
        System.out.println("Nome: ");
        nome = teclado.next();

        // Solicita ao usuário que digite seu salário fixo
        System.out.println("Salário Fixo R$: ");
        salario = teclado.nextDouble();

        // Solicita ao usuário que digite o total de vendas realizadas
        System.out.println("Vendas realizadas pelo vendedor R$: ");
        valor = teclado.nextDouble();

        // Solicita ao usuário que digite o percentual sobre as vendas realizadas
        System.out.println("Digite o percentual da comissão : ");
        p = teclado.nextDouble();

        // Equação para realizar o percentual sobre sa vendas realizadas
        Double porcentagem = (p /100) * valor;
        System.out.println("O Valor da comissão foi de R$ " + porcentagem);
        teclado.close();

        // Equação para realizar a soma do valor do salário fixo + valor sobre as vendas realizadas
        salariototal = salario + porcentagem;

        System.out.println(nome+" receberá um salário total de R$ "+salariototal);

        teclado.close();


    }
}
