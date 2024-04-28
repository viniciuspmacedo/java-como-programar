package com.example;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite seu peso em kg: ");
        double weight = input.nextDouble();
        
        System.out.print("\nDigite sua altura em metros: ");
        double height = input.nextDouble();
        double bmi = (weight / Math.pow(height, 2));
        String message = String.format("\nSeu IMC é %.2f", bmi);
        System.out.println(message);

        String bmiTable = """

        -----------------------------------
                    VALORES IMC
        -----------------------------------
        Abaixo do peso:     menor que 18.5
        Normal:          entre 18.5 e 24.9
        Acima do peso:     entre 25 e 29.9
        Obeso:                  30 ou mais
        -----------------------------------
        """;

        System.out.println(bmiTable);
        input.close();
    }
}