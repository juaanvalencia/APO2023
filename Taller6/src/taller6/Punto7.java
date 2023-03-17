package taller6;

import java.util.Scanner;

public class Punto7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] resultados = new int[5];
        int suma = 0;

        System.out.println("Ingrese los resultados de las 5 pruebas:");
        for (int i = 0; i < resultados.length; i++) {
            System.out.print("Prueba " + (i+1) + ": ");
            resultados[i] = sc.nextInt();
            suma += resultados[i];
        }

        double promedio = (double)suma / resultados.length;
        System.out.println("El promedio de las pruebas es: " + promedio);
    }
}
