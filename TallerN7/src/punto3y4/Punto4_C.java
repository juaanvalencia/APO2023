package punto3y4;

public class Punto4_C {
	
	//Ejemplo de una excepción
	
		   public static void main(String[] args) {
		      int x = 5;
		      int y = 0;
		      int z = 0;
		      try {
		         z = x / y;
		      } catch (ArithmeticException e) {
		         System.out.println("Se ha producido una excepción: " + e.getMessage());
		      }
		      System.out.println("El resultado es: " + z);
		   }
		}

