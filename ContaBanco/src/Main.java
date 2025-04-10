import entities.ContaTerminal;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        String agencia;
        int numero;
        double saldo;
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite sue nome : ");
        nome = sc.nextLine();
        System.out.println("Digite o número da sua agencia : ");
        agencia = sc.nextLine();
        System.out.println("Digite o número da sua conta : ");
        numero = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o saldo da sua agencia : ");
        saldo = Double.parseDouble(sc.nextLine());



        ContaTerminal c = new ContaTerminal(nome, agencia, numero, saldo);

        c.imprimirConta();
    }
}