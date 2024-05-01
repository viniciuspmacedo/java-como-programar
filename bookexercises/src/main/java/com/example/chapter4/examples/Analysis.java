package com.example.chapter4.examples;

import java.util.Scanner;

//Análise dos resultados de exame utilizando instruções de controle aninhadas.
public class Analysis {
    public static void main(String[] args) {
        // cria Scanner para obter entrada do usuário
        Scanner input = new Scanner(System.in);
        // inicializando as variáveis
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        // processa 10 alunos utlizando o loop controlado por contador
        while (studentCounter <= 10) {
            //solicita entrada de dados do usuário
            System.out.println("Entre com resultado (1: aprovado; 2: reprovado): ");
            int result = input.nextInt();
            if (result == 1) {
                passes++;
            } else {
                failures++;
            }
            //incrementa studentCounter até o loop terminar
            studentCounter++;
        }
        //exibe os resultados
        System.out.printf("Aprovados: %d%nReprovados: %d%n", passes, failures);
        //determina se haverá bonus ao instrutor
        if(passes > 8){
            System.out.println("Bônus para o instrutor!");
        }

        input.close();
    }
}
