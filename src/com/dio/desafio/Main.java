package com.dio.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao banco DIO!");

        System.out.println("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe a agência: ");
        String agencia = scanner.next();

        System.out.println("Informe seu nome: ");
        String nome = scanner.next();

        double saldo;

        do{
            System.out.println("Informe o saldo: ");
             saldo = scanner.nextDouble();
        } while (saldo < 0);

        ContaTerminal conta = new ContaTerminal(numeroConta, agencia, nome, saldo);

    }
}
