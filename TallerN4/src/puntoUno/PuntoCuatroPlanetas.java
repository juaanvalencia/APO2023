package puntoUno;

import java.util.Scanner;

public class PuntoCuatroPlanetas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pesoEnLaTierra, pesoEnOtroPlaneta;
        int opcion;
        
        System.out.print("Ingrese su peso en la Tierra (en libras): ");
        pesoEnLaTierra = input.nextDouble();
        
        System.out.println("\nSeleccione un planeta del siguiente menú:");
        System.out.println("1. Mercurio");
        System.out.println("2. Venus");
        System.out.println("3. Marte");
        System.out.println("4. Júpiter");
        System.out.println("5. Saturno");
        System.out.println("6. Urano");
        System.out.println("7. Neptuno");
        System.out.print("Ingrese el número correspondiente al planeta: ");
        opcion = input.nextInt();
        
        switch(opcion) {
            case 1:
                pesoEnOtroPlaneta = pesoEnLaTierra * 0.38;
                System.out.printf("Su peso en Mercurio es %.2f libras.", pesoEnOtroPlaneta);
                break;
            case 2:
                pesoEnOtroPlaneta = pesoEnLaTierra * 0.91;
                System.out.printf("Su peso en Venus es %.2f libras.", pesoEnOtroPlaneta);
                break;
            case 3:
                pesoEnOtroPlaneta = pesoEnLaTierra * 0.38;
                System.out.printf("Su peso en Marte es %.2f libras.", pesoEnOtroPlaneta);
                break;
            case 4:
                pesoEnOtroPlaneta = pesoEnLaTierra * 2.36;
                System.out.printf("Su peso en Júpiter es %.2f libras.", pesoEnOtroPlaneta);
                break;
            case 5:
                pesoEnOtroPlaneta = pesoEnLaTierra * 0.92;
                System.out.printf("Su peso en Saturno es %.2f libras.", pesoEnOtroPlaneta);
                break;
            case 6:
                pesoEnOtroPlaneta = pesoEnLaTierra * 0.89;
                System.out.printf("Su peso en Urano es %.2f libras.", pesoEnOtroPlaneta);
                break;
            case 7:
                pesoEnOtroPlaneta = pesoEnLaTierra * 1.13;
                System.out.printf("Su peso en Neptuno es %.2f libras.", pesoEnOtroPlaneta);
                break;
            default:
                System.out.println("Opción inválida.");
        }
        
        input.close();
    }
}
