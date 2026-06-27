package rede.social;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */

public class GestorReacoes {
    
    public static void  guardar_reacao(Reacao R){
        
    
        try( BufferedWriter rw =
          new BufferedWriter (
          new FileWriter("reacao.txt",true)
          )
                
         ){
             rw.write(R.getReacoes()+ ";" + R.getReagidor()+ ";" + R.getDataReac()+ ";"+R.getIdPublicacao() +";" );
              rw.newLine();
           
              
          
          }catch(IOException e){
                System.out.println("Erro ao guardar reação");
          }
                    
    
  }  
   

    
    public static  ArrayList <Reacao> Carregar_reacao(){
                       
             ArrayList<Reacao> lista = new ArrayList<>();
            try(
                BufferedReader pr =
                new BufferedReader(
                new FileReader("reacao.txt")
                )
      
             ){
    
                 String linha;
                 while((linha=pr.readLine()) != null){
                        if(linha.trim().isEmpty()){
                         continue;
                     }
                     String [] data  = linha.split(";");
                     LocalDateTime dataEnvio = LocalDateTime.parse(data[2]);
                
                     Reacao reac = new Reacao(data[0], data[1] ,dataEnvio,Integer.parseInt(data[3]));
                     lista.add(reac);
              
                 } 
    
          }catch(IOException e){
              System.out.println("Nenhuma reação adicionada seja o primeiro a reagir");
          }  

         return lista;
    } 
    
         public static void reescreverReacao(ArrayList<Reacao> R){
        
                try(BufferedWriter pw =new BufferedWriter(new FileWriter("reacao.txt"))){
            
                    for(Reacao i:R){
                    
                    pw.write( i.getReacoes()+ ";" + i.getReagidor()+ ";" + i.getDataReac()+ ";" );
                    pw.newLine();
                   
                }
        
        
            }catch(IOException e){
              System.out.println("Erro ao reescrever ficheiro.");
                   
            }
    
        }
                    // funcao procurar as publicaoes de determinado usuario       
        
   }

        



