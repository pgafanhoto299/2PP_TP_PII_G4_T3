/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rede.social;

import java.util.Scanner;

/**
 *
 * @author guga
 */
public class Menu {
     
     static Scanner input = new Scanner(System.in);
    
     public static void mostrarMenuPrincipal() {

        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("1. Criar conta");
        System.out.println("2. Iniciar Sessão");
        System.out.println("3. Fechar programa");

    }
     
    //Ler a opcao
    public static int lerOpcao(){
        System.out.println("Escolha uma opção: ");
        return input.nextInt();
    }
    
    //Processar a opcao escolhida
    public static void executarOpcaoMenuPrincipal(int opcao){
        switch (opcao) {

            case 1 -> criarConta();

            case 2 -> iniciarSessao();

            case 3 -> System.out.println("Programa encerrado.");

            default -> System.out.println("Opção inválida!");
        }
    }
    
    public static void criarConta() {
        System.out.println("Criando conta...");
    }

    public static void iniciarSessao() {
        System.out.println("Iniciando sessão...");       
    }
    public static void motrarMenuRedeSocial() {

        System.out.println("===== MENU REDE SOCIAL =====");
        System.out.println("1. Chat");
        System.out.println("2. Página inicial");
        System.out.println("3. Definições");

    }
    
    public static void executarOpcaoMenuRedeSocial(int opcao){
        switch (opcao) {

            case 1 -> paginaInicial();

            case 2 -> chat();

            case 3 -> definicoes();

            default -> System.out.println("Opção inválida!");
        }
    }

    private static void paginaInicial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void chat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void definicoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
