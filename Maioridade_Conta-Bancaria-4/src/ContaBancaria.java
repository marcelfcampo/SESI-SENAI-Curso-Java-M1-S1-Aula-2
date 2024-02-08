
/*
 Faça um programa que simule o funcionamento de uma conta bancária.
 As definições da classe conta são:
● atributos : número da conta, nome do correntista e saldo da conta.
● métodos : depositar, sacar e imprimir saldo.
 */

public class ContaBancaria {
    private int numeroConta;
    private String nomeCorrentista;
    private double saldoConta;

    // Construtor da classe ContaBancaria
    public ContaBancaria(int numeroConta, String nomeCorrentista, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldoConta = saldoInicial;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            saldoConta += valorDeposito;
            System.out.println("Depósito de " + valorDeposito + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valorSaque) {
        if (valorSaque > 0 && valorSaque <= saldoConta) {
            saldoConta -= valorSaque;
            System.out.println("Saque de " + valorSaque + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    // Método para imprimir o saldo da conta
    public void imprimirSaldo() {
        System.out.println("Saldo da conta: " + saldoConta);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria(123456, "João", 1000.0);

        // Realizando operações na conta
        minhaConta.depositar(500.0);
        minhaConta.imprimirSaldo();

        minhaConta.sacar(200.0);
        minhaConta.imprimirSaldo();
    }
}

/*
Neste exemplo, a classe ContaBancaria possui os atributos numeroConta, nomeCorrentista e saldoConta,
juntamente com os métodos depositar, sacar e imprimirSaldo para realizar operações bancárias básicas.
No método main, são realizadas operações de depósito, saque e impressão do saldo da conta para
demonstrar o funcionamento básico da classe ContaBancaria.
 */