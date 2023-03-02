package puntoUno;

import java.util.Scanner;

public class PuntoDosLogica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduzca el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Introduzca el operador (+, -, *, / o %): ");
        char operador = sc.next().charAt(0);

        double resultado;

        if (operador == '+') {
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (operador == '-') {
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
        } else if (operador == '*') {
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
        } else if (operador == '/') {
            if (num2 == 0) {
                System.out.println("Error: división por cero.");
            } else {
                resultado = num1 / num2;
                System.out.println("El resultado de la división es: " + resultado);
            }
        } else if (operador == '%') {
            resultado = num1 % num2;
            System.out.println("El resultado del módulo es: " + resultado);
        } else {
            System.out.println("Operador no válido.");
        }

        sc.close();
    }
}
