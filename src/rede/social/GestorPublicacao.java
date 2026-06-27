package rede.social;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GestorPublicacao {
    
    public static void  guardar_publicacao(Publicacao P){
        
    
        try( BufferedWriter pw =
          new BufferedWriter (
          new FileWriter("Publicacao.txt",true)
          )
                
         ){
             pw.write(P.getConteudo() + ";" + P.getRemetente() + ";" + P.getDataEnvio() + ";"+ P.getId());
             
             pw.newLine();
           
              System.out.println("Publicacao adicionada com sucesso");
          
          }catch(IOException e){
                System.out.println("Erro ao guardar publicacao");
          }
                    
    
}  
   

    
    public static  ArrayList <Publicacao> Carregar_publicacao(){
                       
          ArrayList<Publicacao> lista = new ArrayList<>();
         try(
            BufferedReader pr =
            new BufferedReader(
            new FileReader("Publicacao.txt")
          )
      
        ){
    
                 String linha;
                 while((linha=pr.readLine()) != null){
                     if(linha.trim().isEmpty()){
                         continue;
                     }
                    String [] data  = linha.split(";");
                    LocalDateTime dataEnvio = LocalDateTime.parse(data[2]);
                    
                    Publicacao pub = new Publicacao(data[0], data[1] , dataEnvio ,Integer.parseInt(data[3]));
                    lista.add(pub);
              
                 } 
    
          }catch(IOException e){
              System.out.println("Nenhuma publicação encontrada.");
          }  

         return lista;
    } 
    
        public static void reescreverPublic(ArrayList<Publicacao> P){
        
             try(BufferedWriter pw =new BufferedWriter(new FileWriter("Publicacao.txt"))){
            
                 for(Publicacao i:P){
                    
                    pw.write( i.getConteudo() + ";" + i.getRemetente() + ";" + i.getDataEnvio() + ";" + i.getId());
                    pw.newLine();
                   
                }
        
        
            }catch(IOException e){
              System.out.println("Erro ao reescrever ficheiro.");
                   
            }
    
        }
                    // funcao procurar as publicaoes de determinado usuario 
            public static  ArrayList<Publicacao> procurarPubliC (String remetente){ 
            
                 ArrayList<Publicacao> todaspublicacoess = Carregar_publicacao();
                 ArrayList<Publicacao> publifound = new ArrayList<>(); // Array para guardar as publicacoes encontradas desse remetente
                 
                 if(Menu.utiActual.getUsername().equalsIgnoreCase(remetente)){
                          
                          System.out.println("O usuário digitado corresponde ao seu  deseja ver suas publicações ");
                         
                          System.out.println("1.Sim");
                          System.out.println("2.Não");     
                          int op=Menu.input.nextInt();
                        
                          if(op==1)
                            
                              procurarMinhasPubliC(remetente);                  // ir para minhas publicacoes 
                          
                          else if(op==2){
                                
                              System.out.println("Voltando...");
                                Menu.publicacao();
                            
                          }else{
                                System.out.println("Opcao inválida");
                                  Menu.publicacao();
                          }
                }
                      for( Publicacao i : todaspublicacoess){

                           if(i.getRemetente().equals(remetente)){     
                                publifound.add(i);
                           }
                            
                      }
               
                       return publifound; 
               }   
                      
                            // funcao exclusiva para mostrar as publicaoes do user atual
            
         public static  ArrayList<Publicacao> procurarMinhasPubliC (String remetente){ 
            
                 ArrayList<Publicacao> todaspublicacoess = Carregar_publicacao();
                 ArrayList<Publicacao> publicMinhas = new ArrayList<>(); // Array para guardar as publicacoes encontradas dele mesmo, minhas publicaoes
               
                for( Publicacao i : todaspublicacoess){
                   if(i.getRemetente().equalsIgnoreCase(remetente))
                      publicMinhas.add(i);
                }
             
            
                  return publicMinhas;
              
         }
         
                            
            public static ArrayList<Publicacao> deletarPubli(int i){  // deletar publicacao com base na posicao da pub no array list
               
                    ArrayList<Publicacao> todasPublicacoes=Carregar_publicacao();
                    ArrayList<Publicacao> todasMinhasPublic = procurarMinhasPubliC(Menu.utiActual.getUsername()); 
                
                    if(i>todasMinhasPublic.size() ||i<1){
                       System.out.println("Publicacao a apagar não encontrada");
                       return todasPublicacoes;
                    }
                        
                     Publicacao apagar = todasMinhasPublic.get(i-1 ); // encontrar pub a apagar pela posição 
                     int idApagar = apagar.getId();                     // descobrir a que id está associada a publicação
                     todasPublicacoes.removeIf(p-> p.getId()==idApagar);  // percorrer a lista e encontrar o post referente aquele id 
                    
                     System.out.println("Publicação eliminada");
                     return todasPublicacoes;
           
            }
  }
        

     




   




