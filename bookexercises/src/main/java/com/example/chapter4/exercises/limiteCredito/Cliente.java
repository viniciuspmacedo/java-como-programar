package com.example.chapter4.exercises.limiteCredito;

public class Cliente {
    private int numeroConta;
    private int saldoInicial;
    private int saldoFinal;
    private int limiteCredito;
    private int totalDepesas = 0;
    private int totalCreditos = 0;

    public Cliente(int numeroConta, int saldoInicial, int limiteCredito) {
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial;
        this.limiteCredito = limiteCredito;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(int saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public int getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public int getSaldoFinal() {
        return saldoFinal;
    }
    
    public void setSaldoFinal() {
        saldoFinal = saldoInicial + totalDepesas - totalCreditos;
    }

    public void somaDespesas(int despesa) {
        if (despesa > 0) {
            totalDepesas += despesa;
        }
    }

    public void somaCreditos(int credito) {
        if (credito > 0) {
            totalCreditos += credito;
        }
    }

    public boolean excedeLimite(){
        return saldoFinal > limiteCredito;
    }
}
