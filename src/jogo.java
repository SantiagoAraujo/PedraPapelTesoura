

public class jogo{
   
    public String verificarVencedor(int escolhaPessoa, int numeroComputador){
    
    if(escolhaPessoa == numeroComputador){
     return "Empate";
    } else if(escolhaPessoa < numeroComputador){
     return "computador!";
    } else{return "jogador!";}
      }


    }