package com.example.chapter4.exercises.comissaoVendas;

import java.util.Scanner;

public class ComissaoVendas {
    public static void main(String[] args) {
        double totalVendas = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do item ou 0 para sair.");
        double valor = input.nextDouble();

        while (valor != 0) {
            totalVendas += valor;
            System.out.println("Digite o valor do item ou 0 para sair.");
            valor = input.nextDouble();
        }

        double totalRendimentos = 200 + (totalVendas * 0.09);

        System.out.printf("Total de rendimentos a receber: R$ %.2f%n", totalRendimentos);
        
        input.close();
    }
}
