package taller8;

public class Punto4_5_6 {
	public Punto4_5_6() {
		Student[] students = new Student[3];
		// Crear los tres estudiantes
		students[0] = new Student("Mary Jones", 14, 46);
		students[1] = new Student("John Stiner", 60, 173);
		students[2] = new Student("Ari Samala", 31, 69);
		
		// Modificar al ultimo estudiante
		int credits = students[2].getCreditos();
		int qualityPoints = students[2].getPuntosCalidad();;
		students[2].setCreditos(credits + 3);
		students[2].setPuntosCalidad(qualityPoints + 52);
		
		students[2].inputCreditosYCalidadPuntos();
	}
}