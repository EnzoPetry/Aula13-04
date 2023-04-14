package com.company;

import java.util.Scanner;

public class ATM {
    private BancoController controller;

    public ATM(BancoController controller) {
        this.controller = controller;
    }

    public void desenhaMenu(){
        System.out.println("Banco\n");
        System.out.println("1- Criar Conta");
        System.out.println("2- Remover Conta");
        System.out.println("3- Acessar Conta");
        System.out.println("4- Sair");
    }
    public void abrirConta(){
        System.out.println("Abrindo conta...");
        System.out.println("Digite o nome do cliente: ");
        Scanner s = new Scanner(System.in);
        String nome = s.nextLine();



    }
}
