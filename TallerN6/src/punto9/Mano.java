package punto9;

public class Mano {
	  private Card cardArray[] = new Card[5];
	  private int cards = 0;
	  private int score = 0;
	  private String name = "";
	  private boolean isFullHand = false;
	  private boolean isBusted = false;

	  Mano(String name) {
	    setName(name);
	  }

	  Mano() { 

	  }

	  public String toString() {
	    String tempString = "------------------------------------------------------------\n";
	    tempString += ">>> Hand by " + getName() + " <<<\n[";
	    for (int i = 0; i < getCards(); i++) {
	      tempString += cardArray[i].toString() + " (" + cardArray[i].points + ")";
	      if (i < getCards() - 1) {
	        tempString += ", ";
	      }
	    }
	    tempString += "]" + (getIsBusted() ? " (Busted)" : "") + "\nHand score: " + getScore();
	    return tempString;
	  }
	  
	  public boolean addCard(Card card) {
	    boolean response = false;

	    if (!getIsFullHand() || getScore() < 21) {
	      cardArray[getCards()] = card;
	      setCards(getCards() + 1);
	      response = true;

	      setIsBusted();
	      setIsFullHand();
	    }

	    return response;
	  }

	  public Card[] getCardArray() {
	    return cardArray;
	  }

	  public void sumScore() {
	    setScore(0);
	    for (int i = 0; i < getCards(); i++) {
	      cardArray[i].points = cardArray[i].getPoints(cardArray[i].name);// Actualiza los puntos de la carta.
	      setScore(getScore() + cardArray[i].points);
	    }
	  }

	  public boolean getIsBusted() {
	    return isBusted;
	  }

	  public boolean getIsFullHand() {
	    return isFullHand;
	  }

	  public void setIsFullHand() {
	    if (getCards() >= 5) {
	      this.isFullHand = true;
	    } else {
	      this.isFullHand = false;
	    }
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public void setScore(int score) {
	    this.score = score;
	  }

	  public void setCards(int cards) {
	    this.cards = cards;
	  }

	  public String getName() {
	    String s = this.name;
	    String firstLetter = s.substring(0, 1);
	    String restOfString = s.substring(1);
	    String result = firstLetter.toUpperCase() + restOfString.toLowerCase();
	    return result;
	  }

	  public int getScore() {
	    return this.score;
	  }

	  public int getCards() {
	    return this.cards;
	  }

	  private void setIsBusted() {
	    sumScore();

	    if (score > 21) {
	      this.isBusted = true;
	      if (convertAcesToOneScore()) { 
	        setIsBusted();
	      }
	    } else
	      this.isBusted = false;
	  }

	  private boolean convertAcesToOneScore() {
	    boolean isAceConverted = false;
	    boolean response = false;

	    for (int i = 0; i < cards; i++) {
	      isAceConverted = cardArray[i].getPointAce() == 11;
	      cardArray[i].setPointAce(); 

	      if (isAceConverted) {
	        response = true;
	      }
	    }

	    sumScore();
	    return response;
	  }
	}
