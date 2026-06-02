/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rede.social;

/**
 *
 * @author guga
 */
public class REDESOCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int opcaoP, opcaoRS;
       
       do{
           Menu.mostrarMenuPrincipal();
           opcaoP = Menu.lerOpcao();
           Menu.executarOpcaoMenuPrincipal(opcaoP);
           
           // Não concluido após iniciar sessão mostra o menu rede social
           if(opcaoP == 2){
              do{
                   Menu.motrarMenuRedeSocial();
                   opcaoRS = Menu.lerOpcao();
                   Menu.executarOpcaoMenuRedeSocial(opcaoRS);
                   
              }while(opcaoRS != 4);
           }
       }while(opcaoP != 3);
    }
    
}
