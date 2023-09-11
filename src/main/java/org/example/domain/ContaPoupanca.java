package org.example.domain;

public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato(){
        System.out.println("#-#-# EXTRATO CONTA POUPANÇA #-#-#");
        imprimirAtributosExtrato();
    }
}
