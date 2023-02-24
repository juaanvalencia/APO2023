package punto1;

import java.lang.Math;

public class PuntoDosE {
  public static void main(String[] args) {
    double x = 2.0; // El valor de x
    double y = 3.0; // El valor de y
    double e = 1/y - 1/x - Math.pow(2,y); // Calcula el valor de e

    System.out.println("El valor de e es: " + e);
  }
}
