package punto1;

import java.lang.Math;

public class PuntoDosB {
  public static void main(String[] args) {
    double x = 2.0; // El valor de x
    double y = 3.0; // El valor de y
    double b = Math.pow(x, y) - Math.pow(6, x); // Calcula el valor de b

    System.out.println("El valor de b es: " + b);
  }
}
