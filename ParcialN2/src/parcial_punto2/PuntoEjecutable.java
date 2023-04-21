package parcial_punto2;

import java.util.Scanner;

public class PuntoEjecutable {
	  public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

		System.out.println("Digite sus datos: ");
		System.out.print("Digite su nombre  ");
		String nombre = sc.nextLine();

		System.out.print("Digite su edad ");
		int edad = sc.nextInt();

		System.out.print("Digite su sexo (M o H) ");
		char sexo = sc.next().charAt(0);

		System.out.print("Digite su peso(Kg) ");
		double peso = sc.nextDouble();

		System.out.print("Digite su altura(M)");
		double altura = sc.nextDouble();

		Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
		Persona persona2 = new Persona(nombre, edad, sexo);
		Persona persona3 = new Persona();

		persona3.setNombre(nombre);
		persona3.setEdad(edad);
		persona3.setSexo(sexo);
		persona3.setPeso(peso);
		persona3.setAltura(altura);

		System.out.println("--------- Primera Información -----------");
		System.out.println(persona1);
		System.out.println(persona1.getNombre() + pesoIdeal(persona1));
		System.out.println(persona1.getNombre() + mayorDeEdad(persona1));

		System.out.println("---------- Segunda informacion ------------");
		System.out.println(persona2);
		System.out.println(persona2.getNombre() + pesoIdeal(persona2));
		System.out.println(persona2.getNombre() + mayorDeEdad(persona2));

		System.out.println(" --------- Tercera informacion ------------ ");
		System.out.println(persona3);
		System.out.println(persona3.getNombre() + pesoIdeal(persona3));
		System.out.println(persona3.getNombre() + mayorDeEdad(persona3));

	}

	private static String mayorDeEdad(Persona persona) {
		if (persona.esMayorDeEdad()) {
			return " Es mayor de edad";
		} else {
			return " No es mayor de edad";
		}
	}

	private static String pesoIdeal(Persona persona) {
		switch (persona.calcularIMC()) {
		case 1: {
			return " Tiene sobrepeso";
		}
		case 0: {
			return " Esta por debajo de su peso ideal";
		}
		case -1: {
			return " Tiene su peso ideal";
		}
		default:
			return " ((Hubo un error))";
		}
	}
 }

