package puntoUno;

import java.util.Scanner;

public class EjercicioTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un valor para x: ");
        int x = sc.nextInt();

        // Operador ternario
        boolean resultado1 = (x <= 7) ? true : false;
        System.out.println("Resultado usando operador ternario: " + resultado1);

        // Sentencia if/else
        boolean resultado2;
        if (x <= 7) {
            resultado2 = true;
        } else {
            resultado2 = false;
        }
        System.out.println("Resultado usando sentencia if/else: " + resultado2);
    }
}
