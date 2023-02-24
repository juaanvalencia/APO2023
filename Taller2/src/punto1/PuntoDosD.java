package punto1;

import java.lang.Math;

public class PuntoDosD {
  public static void main(String[] args) {
    double x = 2.0; // El valor de x
    double y = 3.0; // El valor de y
    double d = Math.pow(x, 4) - Math.sqrt(6*x) - Math.pow(y, 3); // Calcula el valor de d

    System.out.println("El valor de d es: " + d);
  }
}
