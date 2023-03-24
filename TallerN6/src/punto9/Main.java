package punto9;

import java.util.Scanner;

public class Main {
  public Main(int numPlayers, boolean isCrupier, Scanner sc) {
    int numberOfHands = isCrupier ? numPlayers + 1 : numPlayers;
    Baraja d = new Baraja(); 
    Mano[] handsArray = new Mano[numberOfHands];
    Mano tempHand = null;
    Curpier curpier = new Curpier ();
    
    int handsLength = isCrupier ? handsArray.length - 1 : handsArray.length;

    System.out.print(" DECK ");
    d.print();
    System.out.print(" MEZCLANDO BARAJA ");
    d.shuffle();
    d.print();

    for (int i = 0; i < handsLength; i++) {
      handsArray[i] = new Mano("Player " + (i + 1));

      tempHand = handsArray[i]; 
      tempHand = d.dealCards(tempHand); 
      System.out.println(tempHand); 
    }
    if (isCrupier) { 
      handsArray[handsArray.length - 1] = curpier.getMano();

      tempHand = handsArray[handsArray.length - 1];
      tempHand = d.dealCards(tempHand);
      System.out.println(tempHand);
    }

    System.out.print(" JUGANDO ");

    sc.nextLine();
    for (int i = 0; i < numberOfHands; i++) {
      String response = "";
      tempHand = handsArray[i];

      System.out.println(tempHand);

      while (!tempHand.getIsBusted() && !tempHand.getIsFullHand()) {
        System.out.println("¿quieres golpear? (y/n)");
        if (i >= numberOfHands - 1 && isCrupier) {
          curpier.setMano(tempHand);
          response = curpier.playMano() ? "y" : "n";
          System.out.println(">> " + response);
        } else {
          System.out.print(">> ");
          response = sc.nextLine();
        }

        if (response.equalsIgnoreCase("y")) {
          handsArray[i] = d.addCardHand(tempHand);
          System.out.println(tempHand);
        } else {
          break;
        }
      }
    }
    System.out.println(winnerHand(numberOfHands, handsArray));

  }

  private String winnerHand(int numberOfHands, Mano[] handsArray) {
    Mano tempHandWinner = null;
    String responseString = "";
    int maxScore = 0;
    int maxScoreIndex = 0;

    for (int i = 0; i < numberOfHands; i++) {
      tempHandWinner = handsArray[i];

      if (tempHandWinner.getScore() > maxScore && tempHandWinner.getScore() <= 21) {
        maxScore = tempHandWinner.getScore();
        maxScoreIndex = i;
      }
    }

    tempHandWinner = handsArray[maxScoreIndex];

    if (!tempHandWinner.getIsBusted())
      responseString = "El ganador es " + tempHandWinner.getName() + " | Score: " + tempHandWinner.getScore();
    else
      responseString = "Este no es el ganador";
    return responseString;
  }
}
