package pack;

import java.util.Scanner;

public class ContaBancaria {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);


     Conta conta = new Conta();
     System.out.println("Digite o nome do titular da conta:");
     conta.titular = scan.nextLine();

     System.out.println("Digite o numero da operação que você quer fazer:");
     System.out.println("1 para depósito, 2 para saque");
     int op = scan.nextInt();

     if (op == 1) {
         System.out.println("Digite o valor para ser depositado");
         double valor = scan.nextDouble();
         conta.depositar(valor);
     } else if (op == 2) {
         System.out.println("Digite o valor para saque:");
         double valor = scan.nextDouble();
         conta.sacar(valor);
     } else {
         System.out.println("Opção inválida.");
     }

     System.out.println("O saldo da conta de " + conta.titular + " e de: R$ " + conta.saldo);
     scan.close();  
 }
}