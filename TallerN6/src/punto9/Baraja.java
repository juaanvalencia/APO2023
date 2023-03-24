package punto9;

import java.util.Random;

public class Baraja {
  Card[] cardArray = new Card[52];
  int lastDealtCardPosition = 0;

  Baraja() { // constructor
    int suits = 4;
    int cardType = 13;
    int cardCount = 0;
    for (int i = 1; i <= suits; i++)
      for (int j = 1; j <= cardType; j++) {
        cardArray[cardCount] = new Card(i, j);
        // cardArray[cardCount] = new Card(i, 1);
        cardCount++;
      }
  }

  public void print() {
    System.out.println();
    for (int i = lastDealtCardPosition; i < cardArray.length / 4; i++)
      System.out.printf("%-25s %-25s %-25s %-25s\n", "(" + (i + 1) + ")" + cardArray[i], "(" + (i + 1 + 13) + ")"
          + cardArray[i + 13], "(" + (i + 1 + 26) + ")" + cardArray[i + 26],
          "(" + (i + 1 + 39) + ")" + cardArray[i + 39]);
  }

  public boolean shuffle() {

    Random r = new Random();
    int max = cardArray.length; 
    int min = lastDealtCardPosition;
    int numRandom = 0;
    Card tempCard = null;

    for (int i = min; i < max; i++) {
      numRandom = r.nextInt(max - min) + min; 
                                              
     
      tempCard = cardArray[i];

      cardArray[i] = cardArray[numRandom];
      cardArray[numRandom] = tempCard;
    }
    return true;
  }

  public Mano dealCards(Mano mano) {
    Card card1 = cardArray[lastDealtCardPosition];
    Card card2 = cardArray[lastDealtCardPosition + 1];

    mano.addCard(card1);
    mano.addCard(card2);

    lastDealtCardPosition += 2;
    return mano;
  }

  public Mano addCardHand(Mano mano) {
    Card card = cardArray[lastDealtCardPosition];
    mano.addCard(card);
    lastDealtCardPosition++;
    return mano;
  }

}