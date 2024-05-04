package com.example.chapter4.exercises.quadrado;

import java.util.Scanner;

public class Quadrado {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eixoX, eixoY;
        System.out.println("Qual o tamanho do quadrado (1 a 20):");
        int tamanho = input.nextInt();

        eixoX = eixoY = tamanho;

        while (eixoY > 0) {

            while (eixoX > 0) {
                if (eixoY == tamanho || eixoY == 1) {
                    System.err.print("* ");
                    eixoX--;
                } else {
                    if (eixoX == tamanho || eixoX == 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    eixoX--;
                }
            }
            eixoX = tamanho;
            System.err.println();
            eixoY--;
        }

        input.close();
    }

}
