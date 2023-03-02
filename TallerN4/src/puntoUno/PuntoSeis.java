package puntoUno;

import java.util.Scanner;

public class PuntoSeis {

    public static void main(String[] args) {

        double average;
        int daysAbsent;
        boolean exempt = false;

        Scanner reader = new Scanner(System.in);
        System.out.println("Este programa determinará si puedes salir del examen final.");
        System.out.println("Por favor, conteste a las siguientes preguntas.");

        System.out.println("cual es tu promedio en la clase?");
        average = reader.nextDouble();

        System.out.println("¿Cuántas conferencias de clase te has perdido?");
        daysAbsent = reader.nextInt();

        if ((average >= 90 && daysAbsent <= 3) || (average >= 80 && daysAbsent == 0)) {
            exempt = true;
        }

        if (exempt) {
            System.out.println("¡Felicidades! Estás exento del examen final.");
        } else {
            System.out.println("No estás exento del examen final.");
        }
    }
}
