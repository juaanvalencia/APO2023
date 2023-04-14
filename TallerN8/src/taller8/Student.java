package taller8;

import java.util.Scanner;

public class Student {
private Scanner entrada = new Scanner(System.in);
String nombre = "";
int creditos = 0;
float promedioPuntos = 0.0f;
int puntosCalidad = 0;

Student(String nombre, int creditos, int puntosCalidad) {
	setNombre(nombre);
	setCreditos(creditos);
	setPuntosCalidad(puntosCalidad);
	
	actualizarPromedioPuntos();
}

public void ingresarCreditosYPuntosCalidad() {
	System.out.print("Por favor ingrese el número de créditos para este curso: ");
	int creditos = entrada.nextInt();
	setCreditos(creditos);
	
	System.out.print("Por favor ingrese los puntos de calidad para este curso: ");
	int puntosCalidad = entrada.nextInt();
	setPuntosCalidad(puntosCalidad);
	
	actualizarPromedioPuntos();
}

private void actualizarPromedioPuntos() {
	setPromedioPuntos((float)getPuntosCalidad() / getCreditos());
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getCreditos() {
	return creditos;
}

public void setCreditos(int creditos) {
	this.creditos = creditos;
}

public float getPromedioPuntos() {
	actualizarPromedioPuntos();
	return promedioPuntos;
}

public void setPromedioPuntos(float promedioPuntos) {
	this.promedioPuntos = promedioPuntos;
}

public int getPuntosCalidad() {
	return puntosCalidad;
}

public void setPuntosCalidad(int puntosCalidad) {
	this.puntosCalidad = puntosCalidad;
}

public void inputCreditosYCalidadPuntos() {
	// TODO Auto-generated method stub
	
}
}

