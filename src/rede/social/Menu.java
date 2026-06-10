/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rede.social;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guga
 */
public class Menu {
     
     public static ArrayList<Utilizador> utilizadores = new ArrayList<>(); // vamos ter que carregar todos os ficheiros a partir do menu
    
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

            case 1 -> criarConta(utilizadores);

            case 2 -> iniciarSessao();

            case 3 -> System.out.println("Programa encerrado.");

            default -> System.out.println("Opção inválida!");
        }
    }
    
    public static void menuRedeSocial() {
        int opcao;

        do {
            motrarMenuRedeSocial();
            opcao = lerOpcao();

            executarOpcaoMenuRedeSocial(opcao);

        } while (opcao != 4);
    }
    
    public static void motrarMenuRedeSocial() {

        System.out.println("===== MENU REDE SOCIAL =====");
        System.out.println("1. Página inicial");
        System.out.println("2. Chat");
        System.out.println("3. Definições");
        System.out.println("4. Terminar sessão");

    }
    
    public static void executarOpcaoMenuRedeSocial(int opcao){
        switch (opcao) {

            case 1 -> paginaInicial();

            case 2 -> chat();

            case 3 -> definicoes();
            
            case 4 -> System.out.println("Terminando Sessão...");

            default -> System.out.println("Opção inválida!");
        }
    }
    
    public static void terminarSessao(){
        System.out.println("Terminando Sessão!"); 
    }
    
    public static void paginaInicial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void chat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void definicoes() {

        System.out.println("===== DEFINIÇÕES =====");
        System.out.println("1. PERFIL");
        System.out.println("2. MUDAR SENHA");
        System.out.println("3. MUDAR EMAIL");
        System.out.println("4. Terminar sessão");

    }
    
    public static void executarDefinicoes(int opcao){
        switch (opcao) {

            case 1 -> perfil();

            case 2 -> mudarSenha();

            case 3 -> mudarEmail();
            
            case 4 -> terminarSessao();

            default -> System.out.println("Opção inválida!");
        }
    }

    public static void perfil(){}
    public static void mudarSenha(){}
    public static void mudarEmail(){}
    
    public static void criarConta(ArrayList<Utilizador> utilizadores) {
        Scanner input = new Scanner(System.in);
        
        //Senha
        String senha;
        //System.out.println("A senha tem que ter 12 caracteres");
        System.out.println("Insira a sua senha: ");
        while(!Utilizador.verificar_senha(senha = input.nextLine())){
            System.out.println("Insira um senha válido:");
        }
        
        
        //Nome
        System.out.println("Insira o seu nome: ");
        String username = input.nextLine();// FUncao verificar nome
        
        
        //Email
        String email;
        System.out.println("Insira o seu email: ");
        while(!Utilizador.verificar_email(email = input.nextLine())){
            System.out.println("Insira um email válido:");
        }
        System.out.println("Insira a sua data de nascimento: ");
        String dataNasc = input.nextLine(); //FUncao Verificar data
        
        //Definir o ID baseado no ID do ultimo usuario cadastrado
        int id = 0;
        if(utilizadores.isEmpty()){
           id = 1;
        }else{
           id = utilizadores.getLast().getId() + 1;
        }
        
        Utilizador u = new Utilizador(senha, username, email,id, dataNasc);
        
        utilizadores.add(u);
        
        System.out.println("Conta criada com sucesso! Bem vindo a  GVO" + utilizadores.get(id-1).getUsername() + "\n O próximo passo é iniciar sessão!");
        
        
    }
    
    public static void iniciarSessao(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu email: ");
        String email = input.nextLine();
        System.out.println("Digite a sua senha: ");
        String senha = input.nextLine();
        
        //verificar as credenciais
        //Loop para pesquisar as credenciais do usuario ao iniciar sessão
        for(int i = 0; i < utilizadores.size(); i++){
            if(utilizadores.get(i).getEmail().equalsIgnoreCase(email)){
                if(utilizadores.get(i).getSenha().equals(senha)){
                    menuRedeSocial();
                    
                }else{
                    System.out.println("Senha incorreta!");
                    iniciarSessao();
                }
            }else{
                System.out.println("Usuário Inexistente!");
                System.out.println("Por favor, Crie uma conta");
            }
        }
        
        System.out.println("Usuário Inexistente!");
   
    }
    
    //Menu Redes Sociais Opcoes
}
