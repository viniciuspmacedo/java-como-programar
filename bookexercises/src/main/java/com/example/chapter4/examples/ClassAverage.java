package com.example.chapter4.examples;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.println("Digite uma nota ou -1 para sair:");
        int grade = input.nextInt();
        
        while (grade != -1) {
            
            total += grade;
            gradeCounter++;
            
            System.out.println("Digite uma nota ou -1 para sair:");
            grade = input.nextInt();
        }
        if (gradeCounter != 0) {
            double gradeAverage = (double) total / gradeCounter;
            System.out.printf("%nA soma das %d notas inseridas é: %d%n", gradeCounter, total);
            System.out.printf("A média da turma %.2f%n", gradeAverage);
        } else {
            System.out.println("Nenhuma nota foi inserida!");
        }

        input.close();
    }
}
