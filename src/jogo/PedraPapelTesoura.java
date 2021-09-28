package jogo;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

  public void run(){
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    int op = 0;
    do{
      System.out.println("Qual você quer escholher:\n 1-Pedra.\n 2-Papel.\n 3-Tesoura\n sua escolha: ");
      op = scanner.nextInt();
      if(op != 1 & op != 2 & op != 3 ){
        System.out.println("----erro---");
      }
    }while(op != 1 & op != 2 & op != 3 );
    System.out.println(verificarGanhador(escolherJogada(op), escolherJogada(rand.nextInt(2) + 1)));
    scanner.close();
  }

  public String escolherJogada(int op){
    switch(op){
      case 1:
        return "pedra";
      case 2:
        return "papel";
      case 3:
        return "tesoura";
      default:
        return "erro";
    }
  }

  public String verificarGanhador(String j1, String j2){
    if(j1.equals(j2)){
      return "Jogador 1:"+j1+"\nJogador 2: "+j2+"\n====EMPATE=====";
    }else if(j1.equals("papel") & j2.equals("pedra") || j1.equals("pedra") & j2.equals("tesoura") || j1.equals("tesoura") & j2.equals("papel")){
      return "Jogador 1:"+j1+"\nJogador 2: "+j2+"\n====JOGADOR 1 GANHOU!=====";
    }else {
      return "Jogador 1:"+j1+"\nJogador 2: "+j2+"\n====JOGADOR 2 GANHOU!=====";
    }
  }

}
