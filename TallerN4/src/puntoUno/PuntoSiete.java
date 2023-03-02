package puntoUno;

import java.util.Scanner;

public class PuntoSiete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario la altura, largo y ancho de la habitación
        System.out.print("Introduzca la altura de la habitación en pies: ");
        double altura = sc.nextDouble();

        System.out.print("Introduzca el largo de la habitación en pies: ");
        double largo = sc.nextDouble();

        System.out.print("Introduzca el ancho de la habitación en pies: ");
        double ancho = sc.nextDouble();

        // Calcular la superficie total de la habitación
        double superficie = 2 * (altura * largo + altura * ancho);

        // Calcular el número de botes de pintura necesarios
        double botesDe5L = Math.ceil(superficie / 1500);
        double botesDe1L = Math.ceil(superficie / 300);

        // Calcular el costo de los botes de pintura
        double costoDe5L = botesDe5L * 15;
        double costoDe1L = botesDe1L * 4;

        // Mostrar el resultado al usuario
        System.out.println("Se necesitan " + botesDe5L + " botes de 5 litros de pintura.");
        System.out.println("Se necesitan " + botesDe1L + " botes de 1 litro de pintura.");
        System.out.println("El costo total de los botes de 5 litros es de $" + costoDe5L);
        System.out.println("El costo total de los botes de 1 litro es de $" + costoDe1L);

        // Calcular el número óptimo de botes que debe comprar
        double botesOptimos = Math.ceil((superficie % 1500) / 300) + botesDe5L;
        double costoOptimo = botesOptimos * 15;

        // Mostrar el número óptimo de botes que debe comprar
        System.out.println("El número óptimo de botes que debe comprar es " + botesOptimos);
        System.out.println("El costo óptimo de los botes es de $" + costoOptimo);

        sc.close();
    }
}
