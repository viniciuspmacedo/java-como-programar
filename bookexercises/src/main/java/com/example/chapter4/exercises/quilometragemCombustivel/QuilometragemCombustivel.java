package com.example.chapter4.exercises.quilometragemCombustivel;

import java.util.Scanner;

public class QuilometragemCombustivel {
    public static void main(String[] args) {
        int totalCombustivel = 0;
        int totalQuilometros = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite 1 para gravar dados ou 0 para encerrar.");
        int controle = input.nextInt();

        while (controle != 0) {
            System.out.println("Quantos quilometros você percorreu?");
            int quilometragem = input.nextInt();
            System.out.println("Quantos litros de combustível você gastou?");
            int combustivel = input.nextInt();

            double quilometroPorLitro = (double) quilometragem / combustivel;
            System.out.printf("O rendimento nesta viagem foi de %.2f km/l.%n", quilometroPorLitro);
            totalQuilometros += quilometragem;
            totalCombustivel += combustivel;

            System.out.printf("Total de combustível gasto até aqui: %d%nTotal de combustivel gasto até aqui: %d%n",
                    totalQuilometros, totalCombustivel);

            System.out.println("Digite 1 para gravar dados ou 0 para encerrar.");
            controle = input.nextInt();

        }
        System.out.println("Encerrando aplicação...");

        input.close();
    }
}

/*
 * - Registro de quilometros rodados e combustivel consumido (inteiros) para
 * cada viagem
 * - Calcular e exibir o consumo km/litros para cada viagem e imprimir a
 * quilometragem total
 * e a soma total dos litros de combustivel consumido até esse ponto
 * - O resultado da média deve ser ponto flutuante.
 */

/*
 * PSEUDO-CÓDIGO
 * declarar as variáveis:
 * totalQuilometros
 * totalCombustivel
 * 
 * Inicializa o Scanner;
 * 
 * Exibe mensagem "Digite 1 para gravar dados ou 0 para sair"
 * Declara a variavel controle
 * Registra controle
 * Enquanto controle diferente de 0
    *  Declara variavel quilometroPorLitro
    *  Solicita entrada do de quilometragem
    *  Registra quilometros
    *  Solicita entrada de combustivel
    *  Registra combustivel
    *  Calcula média
    *  Exibir média da viagem
    *  Adiciona quilometros a totalQuilometros
    *  Adiciona combustivel a totalCombustivel
    *  Exibe totalQuilometros e totalCombustivel
    *  Exibe mensagem "Digite 1 para gravar dados ou 0 para sair"
 * imprime "Saindo do programa"
 */
