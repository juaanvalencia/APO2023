package punto9;

import java.util.Scanner;

public class Punto9Finish{

  public Punto9Finish(Scanner sc) {
    int numPlayers = 0;
    boolean withCrupier = false;
    System.out.println("*** Blackjack ***");
    System.out.println("Por favor seleccione una opcion");
    System.out.println("1. Empezar Juego");
    System.out.println("2. Juega 1v1 otra vez contra el curpier");
    System.out.println("3. Salir");
    System.out.print(">> ");

    int choice = sc.nextInt();

    if (choice == 1) {
      while (numPlayers < 1 || numPlayers > 4) {
        System.out.println("How many players? (1-4)");
        System.out.print(">> ");
        numPlayers = sc.nextInt();
      }

      String response = "";
      while (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n")) {
        System.out.println("Play with crupier? (y/n)");
        System.out.print(">> ");
        response = sc.next();
      }

      withCrupier = response.equalsIgnoreCase("y") ? true : false;

    } else if (choice == 2) {
      numPlayers = 1;
      withCrupier = true;
    } else if (choice == 3) {
 
    }

   

    new Main(numPlayers, withCrupier, sc);
  }
}