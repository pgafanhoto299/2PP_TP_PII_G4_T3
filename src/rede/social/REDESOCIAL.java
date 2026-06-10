/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rede.social;

import java.util.ArrayList;

/**
 *
 * @author guga
 */
public class REDESOCIAL {

    
    
    public static void main(String[] args) {
        int opcao;

        do {
            Menu.mostrarMenuPrincipal();
            opcao = Menu.lerOpcao();
            Menu.executarOpcaoMenuPrincipal(opcao);

        } while (opcao != 4 && opcao != 3);
    }
}
