package ejecutable;

import java.util.Scanner;

import parcial.Cohete;
import parcial.Interplaneta;
import parcial.NaveEspacial;
import parcial.Satelite;
import parcial.Transbordador;

public class Main {
    private static final int MAX_NAVES = 9;
    private static NaveEspacial[] inventario = new NaveEspacial[MAX_NAVES];
    private static int contadorNaves = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean terminar = false;

        while (!terminar) {
            System.out.println("¿Qué tipo de nave deseas crear?");
            System.out.println("1. Satélite");
            System.out.println("2. Cohete");
            System.out.println("3. Transbordador Espacial");
            System.out.println("4. Nave Interplanetaria");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearSatelite();
                    break;
                case 2:
                    crearCohete();
                    break;
                case 3:
                    crearTransbordadorEspacial();
                    break;
                case 4:
                    crearNaveInterplanetaria();
                    break;
                case 5:
                    terminar = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                    break;
            }
        }

        System.out.println("Programa finalizado.");
    }

    private static void crearSatelite() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso del satélite:");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la capacidad del satélite:");
        double capacidad = scanner.nextDouble();

        System.out.println("Ingrese la velocidad máxima del satélite:");
        double velocidadMaxima = scanner.nextDouble();

        System.out.println("Ingrese la órbita del satélite:");
        String orbita = scanner.next();

        Satelite satelite = new Satelite(peso, capacidad, velocidadMaxima, orbita);
        agregarNave(satelite);
    }

    private static void crearCohete() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso del cohete:");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la capacidad del cohete:");
        double capacidad = scanner.nextDouble();

        System.out.println("Ingrese la velocidad máxima del cohete:");
        double velocidadMaxima = scanner.nextDouble();

        System.out.println("Ingrese el propulsor del cohete:");
        String propulsor = scanner.next();

        Cohete cohete = new Cohete(peso, capacidad, velocidadMaxima, propulsor);
        agregarNave(cohete);
    }

    private static void crearTransbordadorEspacial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso del transbordador espacial:");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la capacidad del transbordador espacial:");
        double capacidad = scanner.nextDouble();

        System.out.println("Ingrese la velocidad máxima del transbordador espacial:");
        double velocidadMaxima = scanner.nextDouble();

        System.out.println("Ingrese el número de astronautas del transbordador espacial:");
        int numAstronautas = scanner.nextInt();

        Transbordador transbordador = new Transbordador(peso, capacidad, velocidadMaxima, numAstronautas);
        agregarNave(transbordador);
    }

    private static void crearNaveInterplanetaria() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso de la nave interplanetaria:");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la capacidad de la nave interplanetaria:");
        double capacidad = scanner.nextDouble();

        System.out.println("Ingrese la velocidad máxima de la nave interplanetaria:");
        double velocidadMaxima = scanner.nextDouble();

        System.out.println("Ingrese el sistema de propulsión de la nave interplanetaria:");
        String sistemaPropulsion = scanner.next();

        Interplaneta naveInterplanetaria = new Interplaneta(peso, capacidad, velocidadMaxima, sistemaPropulsion);
        agregarNave(naveInterplanetaria);
    }

    private static void agregarNave(NaveEspacial nave) {
        if (contadorNaves < MAX_NAVES) {
            inventario[contadorNaves] = nave;
            contadorNaves++;
            System.out.println("Nave agregada al inventario.");
        } else {
            System.out.println("El inventario de naves está lleno. No se puede agregar más naves.");
        }
    }

    public static void buscarNave(String tipoNave) {
        boolean encontrada = false;
        for (NaveEspacial nave : inventario) {
            if (nave != null && nave.getClass().getSimpleName().equalsIgnoreCase(tipoNave)) {
                encontrada = true;
                System.out.println("Nave encontrada en el inventario: " + nave.getClass().getSimpleName());
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Nave no encontrada en el inventario.");
        }
    }
}
