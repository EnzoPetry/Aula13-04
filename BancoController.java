package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BancoController {
    public Map<String,ContaCorrente> contas;
    private int numeroConta;

    public BancoController() {
        this.contas = new HashMap<>();
    }
    public void criarConta(ContaCorrente conta){
        String key = conta.getAgencia() + "/" + conta.getNumero();
        contas.put(key, conta);
    }
    public ContaCorrente getConta(int agencia, int numero){
        String key = agencia + "/" + numero;
        return contas.get(key);
    }
    public void abrirConta(String nome){
        Pessoa cliente = new Pessoa(nome);
        ContaCorrente cc = new ContaCorrente()
        this.numeroConta++;
        criarConta(cliente);
    }
}
