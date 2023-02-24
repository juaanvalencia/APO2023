package punto1;

import java.lang.Math;

public class PuntoDosC {
  public static void main(String[] args) {
    double x = 2.0; // El valor de x
    double c = 4*Math.cos(2.0/5) - Math.sin(Math.pow(x, 2)); // Calcula el valor de c

    System.out.println("El valor de c es: " + c);
  }
}

