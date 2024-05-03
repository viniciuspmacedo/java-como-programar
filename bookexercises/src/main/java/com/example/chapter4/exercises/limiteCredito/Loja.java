package com.example.chapter4.exercises.limiteCredito;

import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número da conta:");
        int numeroConta = input.nextInt();
        System.out.println("Digite o saldo inicial:");
        int saldoInicial = input.nextInt();
        System.out.println("Digite o limite de crédito:");
        int limiteCredito = input.nextInt();

        Cliente cliente = new Cliente(numeroConta, saldoInicial, limiteCredito);

        System.out.println("Digite 1 para cadastrar despesas");
        System.out.println("Digite 2 para cadastrar créditos");
        System.out.println("Digite 0 para encerrar");

        int controle = input.nextInt();

        while (controle != 0) {
            if (controle == 1) {
                System.out.println("Digite o valor da despesa:");
                int despesa = input.nextInt();
                cliente.somaDespesas(despesa);
            } else if (controle == 2) {
                System.out.println("Digite o valor do crédito:");
                int credito = input.nextInt();
                cliente.somaCreditos(credito);
            } else {
                System.out.println("Opção inválida!");
            }

            System.out.println("Digite 1 para cadastrar despesas");
            System.out.println("Digite 2 para cadastrar créditos");
            System.out.println("Digite 0 para encerrar");

            controle = input.nextInt();

        }

        cliente.setSaldoFinal();
        System.out.printf("O saldo final do cliente é %d%n", cliente.getSaldoFinal());
        if (cliente.excedeLimite()) {
            System.out.println("Limite de crédito excedido");
        }

        input.close();
    }
}
