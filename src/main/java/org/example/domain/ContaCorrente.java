package org.example.domain;

public class ContaCorrente extends ContaPoupanca{
    @Override
    public void imprimirExtrato(){
        System.out.println("#-#-# EXTRATO CONTA CORRENTE #-#-#");
        imprimirAtributosExtrato();
    }
}
