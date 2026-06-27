
package rede.social;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Reacao {
     private  int idPublicacao;// id da reacao
    private String reacoes;
    private LocalDateTime dataReac;
    private String reagidor;

    public String getReacoes() {
        return reacoes;
    }

    public LocalDateTime getDataReac() {
        return dataReac;
    }
    public int getIdPublicacao(){
    return idPublicacao;
    }

    public String getReagidor() {
        return reagidor;
    }

    public void setReacoes(String reacoes) {
        this.reacoes = reacoes;
    }

    public void setDataReac(LocalDateTime dataReac) {
        this.dataReac = dataReac;
    }
    public void setIdPublicacao(int idPublicacao){
    this.idPublicacao=idPublicacao;
    }
    
    
    public void setReagidor(String reagidor) {
        this.reagidor = reagidor;
    }
    
// funcao para adicionar reações ao ficheiro  recebe o id da publicação que se deseja
     public static void adicionarReacao(int idPostreacao){
         ArrayList<Reacao> TodasReacoes = GestorReacoes.Carregar_reacao(); 
         System.out.println("O Que quer comentar: ");
         System.out.println(" 1. Trival ");
         System.out.println(" 2. Dibinguile About you ");
         System.out.println(" 3.Vai dar tudo certo ");
         System.out.println(" 4.Comentar outra coisa ");
         System.out.println(" 5. Exibir reações desse post");
         String string=null;
        int op=Menu.input.nextInt();
           Menu.input.nextLine();
          
          switch(op){
                case 1:
                    string="Trivial";
                  break;
              
                case 2:
                     string=" Dibinguile About you";
                  break;
                
                 case 3:
                        string="Vai dar tudo certo ";
                        break;
                
                 case 4:
                         System.out.println("Esperando comentário");
                         string= Menu.input.nextLine();
                   
                        break;
                   
                 case 5:
                     exibirReacao(idPostreacao);

                     return;
               
                 default:
                        System.out.println("Opção inválida");
                        Menu.publicacao();                  
                        break;
          }  
             
                     System.out.printf("Reação [%s]", string, "Adicionada");
                     Reacao r1 = new Reacao(string, Menu.utiActual.getUsername(),LocalDateTime.now(),idPostreacao); 
                     ArrayList<Reacao> reacao=GestorReacoes.Carregar_reacao();
                     reacao.add(r1);
                     GestorReacoes.guardar_reacao(r1);
                     Menu.publicacao();
           
     } 
           
     
          public Reacao(String reacoes,String reagidor,LocalDateTime dataReac,int idPublicacao){
             
                 this.reacoes=reacoes;
                this.reagidor=reagidor;
                this.idPublicacao=idPublicacao;
                this.dataReac=dataReac;
          }
            
            
       
          public static void exibirReacao(int idPost) {
                boolean encontrou=false;
                 ArrayList<Reacao> react = GestorReacoes.Carregar_reacao();
                 
                 if(react.isEmpty()){
                     return;
                 }
                 
                 for (Reacao r : react) {                                  // r.getReagidor().equalsIgnoreCase(usuarioAlvo)
                     if(r.getIdPublicacao()== idPost){
                        System.out.println(r.getReagidor()+ " reagiu: "+ r.getReacoes());
                     encontrou=true;
                     }
                  }
                    if(!encontrou)
                        System.out.println("Nenhuma reação encontrada para este post");
                 
            }
      }
    
                    
            
     
    











