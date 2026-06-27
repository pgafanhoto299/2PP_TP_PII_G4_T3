
package rede.social;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Publicacao {
 
    private String remetente;
    private String conteudo;
    private LocalDateTime dataEnvio;
    private int id;
    
    public String getRemetente() {
        return remetente;
    }
     public int getId() {
        return id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }
      public void setId(int id) {
        this.id = id;
    }
   
      public Publicacao(String conteudo,String remetente,LocalDateTime dataEnvio,int id){
              this.conteudo=conteudo;
              this.remetente= remetente;
              this.dataEnvio=dataEnvio;
               this.id=id;

}

       public static void exibirPulicacoes (){         
             
            
             ArrayList<Publicacao> publicacoes = new ArrayList<>();
        
             System.out.println("Digite o nome do usuario dono da publicação:");
             String nomeRemetente=Menu.input.nextLine(); // remetente a ser procurado
            
              publicacoes = GestorPublicacao.procurarPubliC(nomeRemetente); //chama o procurar publicao que retorna uma lista de publicacoes desse remetente
              int op,escolha;
                 if(publicacoes.isEmpty()){
                     System.out.println("Publicações do(a) utilizador(a) " +nomeRemetente+ " não enconttrada"); 
                     System.out.println("Tente denovo...");
                   
                    Menu.publicacao();
             
                 }else{
                     System.out.println("\n============================================");
                     System.out.println("\nTodas publicacoes do(a) " +nomeRemetente+ ":");
                     int i=1;
                     for(Publicacao j:publicacoes){
                     System.out.println(i+"."+j.getConteudo()+". publicado em: "+j.getDataEnvio()); // exibe todas publicacoes do remetente desejado
                     i++;
                     
                     }
                        System.out.println("\n=============================================");
                        System.out.println("1-Adicionar reação a um dos posts");
                        System.out.println("2-Ver reações de um post");
                        op=Menu.input.nextInt();
                        System.out.println("=============================================");
                        
                       
                        
                        switch (op) {
                            
                            case 1:
                                  
                                System.out.println("Qual do post quer reagir");
                                  escolha=Menu.input.nextInt();
                                  if(escolha>publicacoes.size() || escolha<1){
                                      System.out.println("Publicação não existe");
                                      return;
                                  }
                                     Publicacao Pescolhida=publicacoes.get(escolha-1);
                                       int idPostReact=Pescolhida.getId();   // o id do post fica igual ao da reação de modo a estarem conectados
                                       Reacao.adicionarReacao(idPostReact);
                                 
                                
                                   
                                break;
                            
                            case 2:
                             
                                System.out.println("Qual dos posts quer ver as reações");
                                escolha=Menu.input.nextInt();
                                Pescolhida=publicacoes.get(escolha-1);
                                Menu.idPostSelecionado = Pescolhida.getId();
                                Reacao.exibirReacao(Menu.idPostSelecionado);
                                
                         break;
                            default: Menu.publicacao();
                            break;
                     }
                 
                 }
                 
                
                 
                 Menu.publicacao();
       }
        
      public static void adicionarPubli(String nome){
          
          int novoid=1;
           System.out.println("Adicionar publicacao");
           System.out.println("Insira o texto a Publicar");
           String content =Menu.input.nextLine();
           ArrayList<Publicacao> atuaisPublicacaoes=GestorPublicacao.Carregar_publicacao();
           
           if(!atuaisPublicacaoes.isEmpty()){
           novoid=atuaisPublicacaoes.getLast().getId()+1;
          
           }
           
           Publicacao novaPublicacao= new Publicacao(content,nome,LocalDateTime.now(),novoid);
           GestorPublicacao.guardar_publicacao(novaPublicacao);
          
           Menu.publicacao();
           
     
      }
      
            public static void exibirMinhasPublicaoes(){
                      ArrayList<Publicacao> Minhaspublicacoes = new ArrayList<>();
               Minhaspublicacoes = GestorPublicacao. procurarMinhasPubliC(Menu.utiActual.getUsername());  //procurar publicaoes do utilizador logado no momento
              
                 if(Minhaspublicacoes.isEmpty()){
                     System.out.println("Não tem nehuma publicacao "+Menu.utiActual.getUsername()); 
                       Menu.publicacao();  
             
                 }else{
                         System.out.println("\n==========================================");
                         System.out.println("Todas suas publicacoes " +Menu.utiActual.getUsername()+ ":");
                         int i=1;
                         for(Publicacao j:Minhaspublicacoes){
                            System.out.println(i+"."+j.getConteudo()); // exibe todas publicacoes do proprio usuario
                            i++;
                        }
                           
                       
              
                }
                   
                        
        
            }
          
            
            public static void eliminarPubli(){  // funcao eliminar chama o metodo  deletar no gestor para apagar uma publicacao com base na posicao do array
                
                exibirMinhasPublicaoes();
                System.out.println("Que publicacao quer eliminar?");
                int i=Menu.input.nextInt();
                Menu.input.nextLine();
               
                ArrayList<Publicacao> NovasPublicacoes =GestorPublicacao.deletarPubli(i);
                
                GestorPublicacao.reescreverPublic(NovasPublicacoes);
                
                exibirMinhasPublicaoes();
                
               
                
            }
         
    }





  
    

    

