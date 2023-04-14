package com.company;

public class ContaCorrente {
    public long agencia;
    public long numero;
    public double saldo;
    public String chPix;
    public Pessoa pessoa;

    public ContaCorrente(long agencia, long numero, double saldo, String chPix, Pessoa pessoa) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.chPix = chPix;
        this.pessoa = pessoa;
    }

    public long getAgencia() {
        return agencia;
    }

    public void setAgencia(long agencia) {
        this.agencia = agencia;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getChPix() {
        return chPix;
    }

    public void setChPix(String chPix) {
        this.chPix = chPix;
    }

    public void create(Pessoa Pessoa){
    }
}
