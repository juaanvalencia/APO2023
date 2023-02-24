package punto1;

import java.util.Scanner;

public class PuntoAutobuses {

public static void main(String[] args) {

final int CAPACIDAD_AUTOBUS = 45; 
int personasApuntadas; 

int autobusesNecesarios; 

int personasEnFurgonetas; 

try (

Scanner scanner = new Scanner(System.in)) {

System.out.print("Ingrese el número de personas apuntadas para el viaje: ");

personasApuntadas = scanner.nextInt();

}

autobusesNecesarios = personasApuntadas / CAPACIDAD_AUTOBUS;

if (personasApuntadas % CAPACIDAD_AUTOBUS != 0) {

autobusesNecesarios++; 

}

personasEnFurgonetas = personasApuntadas - (autobusesNecesarios * CAPACIDAD_AUTOBUS);

System.out.println("El número necesario de autobuses es: " + autobusesNecesarios);

System.out.println("El número total de personas que viajarán en furgonetas es: " + personasEnFurgonetas);

}

}
