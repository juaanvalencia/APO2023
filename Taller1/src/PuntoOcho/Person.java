package PuntoOcho;

public class Person {
	
	//todos los atributos de la clase deben ser de tipo privados 
	// zona de atributos o caracteristicas.
	
	private String name;
	
	private int age;

	
	//el constructor siempre se llemara igual que la clase
	public Person (final String name, final int age) {
		this.name = name;
		this.age = age;
		
		}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EjercicioUnoperson [name=" + name + ", age=" + age + "]";
	}
	
	
}
