package com.example.chapter3;

import java.util.Scanner;

public class AccountTest {
    
    public static void main(String[] args) {
        Account account1 = new Account("Vinicius", 50.0);
        Account account2 = new Account("Joe Due", -7.53);
    
        System.out.println("Saldo antes das movimentações");
        System.out.printf("%s balance: %.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f %n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de depóstio na account1: ");
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);

        System.out.println("Saldo após depósito na account1");
        System.out.printf("%s balance: %.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f %n", account2.getName(), account2.getBalance());

        System.out.println("Digite o valor de depóstio na account2: ");
        depositAmount = input.nextDouble();
        account2.deposit(depositAmount);

        System.out.println("Saldo após depósito na account2");
        System.out.printf("%s balance: %.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f %n", account2.getName(), account2.getBalance());

        input.close();
    }
}
