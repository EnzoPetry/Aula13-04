package com.company;

public class ContaEspecial extends ContaCorrente {
 public double limite;

    public ContaEspecial(long agencia, long numero, double saldo, String chPix) {
        super(agencia, numero, saldo, chPix);
    }
}
