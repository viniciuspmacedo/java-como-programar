package com.example.chapter4.exercises.palindromo;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um inteiro de 5 digitos:");
        int inteiro = input.nextInt();

        int menor = inteiro / 10000;
        int maior = inteiro / 100000;

        while (menor == 0 || maior > 0) {
            System.out.println("Número inválido!");
            System.out.println("Digite um inteiro de 5 digitos:");
            inteiro = input.nextInt();

            maior = inteiro / 100000;
            menor = inteiro / 10000;
        }

        int num5 = inteiro % 10;
        int num4 = (inteiro % 100) / 10;
        int num2 = (inteiro % 10000) / 1000;
        int num1 = (inteiro % 100000) / 10000;

        if (num1 == num5 && num2 == num4) {
            System.out.printf("O número %d é um palíndromo.%n", inteiro);
        } else {
            System.out.printf("O número %d não é palíndromo.%n", inteiro);
        }

        input.close();
    }
}
