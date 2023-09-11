package org.example.domain;

public abstract class Conta implements IConta {
    private int agencia;
    private int conta;
    private double saldo;
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirAtributosExtrato(){
        System.out.printf(String.format("Agencia: %d \n", this.agencia));
        System.out.printf(String.format("Conta: %d \n", this.conta));
        System.out.printf(String.format("Saldo: %.2f \n", this.saldo));
    }
}
