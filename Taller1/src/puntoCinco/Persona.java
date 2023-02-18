package puntoCinco;

import java.util.Scanner;

public class Persona {
	private static Scanner sc;
	private static String name;

	public Persona(String name, int edad) {
		
	}

	public static void main(String[] args) {
		
		
		sc = new Scanner ( System.in);
		System.out.println ("ingrese el nombre de la persona");
		setName(sc.next());
		
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Persona.name = name;
	}
}
