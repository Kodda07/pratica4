package pack;
import java.util.Scanner;

class Conta {
    public String titular;
    public double saldo = 0;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + " realizado");
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }
    public void sacar(double valor) {

        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente para o saque");
        }
    }  
}
