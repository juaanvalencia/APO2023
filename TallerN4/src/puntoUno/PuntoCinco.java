package puntoUno;

import java.util.Scanner;

public class PuntoCinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la clasificación del estudiante (1 para la más alta, 2 para la segunda más alta): ");
        int ranking = scanner.nextInt();
        
        System.out.print("Ingrese el número de alumnos en el instituto: ");
        int numAlumnos = scanner.nextInt();
        
        System.out.print("Ingrese la nota media del estudiante (en una escala de 0.0 a 4.0): ");
        double notaMedia = scanner.nextDouble();
        
        System.out.print("Ingrese la puntuación SAT del estudiante: ");
        int puntSAT = scanner.nextInt();
        
        if (ranking == 1 && numAlumnos >= 1400) {
            System.out.println("El estudiante cumple con los requisitos para ingresar a la Universidad de Mountville");
        } else if (ranking == 2 && numAlumnos >= 1400) {
            System.out.println("El estudiante cumple con los requisitos para ingresar a la Universidad de Mountville");
        } else if (notaMedia >= 4.0 && puntSAT >= 1100) {
            System.out.println("El estudiante cumple con los requisitos para ingresar a la Universidad de Mountville");
        } else if (notaMedia >= 3.5 && puntSAT >= 1300) {
            System.out.println("El estudiante cumple con los requisitos para ingresar a la Universidad de Mountville");
        } else if (notaMedia >= 3.0 && puntSAT >= 1500) {
            System.out.println("El estudiante cumple con los requisitos para ingresar a la Universidad de Mountville");
        } else {
            System.out.println("El estudiante no cumple con los requisitos para ingresar a la Universidad de Mountville");
        }
        
        scanner.close();
    }

}
