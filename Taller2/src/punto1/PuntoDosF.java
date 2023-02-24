package punto1;

import java.lang.Math;

public class PuntoDosF {
  public static void main(String[] args) {
    double x = 2.0; // El valor de x
    double f = 7 * (Math.cos(Math.sqrt(5) - Math.sin(Math.sqrt(3*x-4)))); // Calcula el valor de f

    System.out.println("El valor de f es: " + f);
  }
}
