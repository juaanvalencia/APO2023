package puntoSiete;


import java.util.Scanner;

public class Person {
	public Person(String name, int edad) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner ( System.in);
		System.out.println ("ingrese el nombre de la persona");
		String name = sc.next();
		System.out.println ("ingrese la edad de la persona");
		int edad = sc.nextInt();
		
		Person per = new Person (name, edad);
		per.setAge(30);
		per.setAge("christian");
		System.out.println("la edad de la persona es = " + per.toString());
		
		Person p1 = new Person (name, edad);
		Person p2 = new Person (name, edad);
		
		
		if (p1.getName()==p2.getName())
		{
			System.out.println(p1.getName()+"Tiene la misma edad que = "+p2.getName());
		}
		else
		{
			System.out.println(p1.getName()+"no tiene la misma edad que = "+p2.getName());
		}

}

	private void setAge(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setAge(int i) {
		// TODO Auto-generated method stub
		
	}

	private String getName() {
		// TODO Auto-generated method stub
		return null;
		
  }

}
 
