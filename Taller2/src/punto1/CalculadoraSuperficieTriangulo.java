package punto1;

import java.util.Scanner;

public class CalculadoraSuperficieTriangulo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese la base del triángulo: ");
			double base = scanner.nextDouble();

			System.out.print("Ingrese la altura del triángulo: ");
			double altura = scanner.nextDouble();

			double area = 0.5 * base * altura;

			System.out.println("La superficie del triángulo es: " + area);
		}
    }
}

