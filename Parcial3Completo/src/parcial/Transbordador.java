package parcial;

//Clase concreta: TransbordadorEspacial
public class Transbordador implements NaveEspacial {
 private double peso;
 private double capacidad;
 private double velocidadMaxima;
 private int numAstronautas;

 public Transbordador(double peso, double capacidad, double velocidadMaxima, int numAstronautas) {
     this.peso = peso;
     this.capacidad = capacidad;
     this.velocidadMaxima = velocidadMaxima;
     this.numAstronautas = numAstronautas;
 }

 @Override
 public void despegar() {
     System.out.println("El transbordador espacial despegó.");
 }

 @Override
 public void aterrizar() {
     System.out.println("El transbordador espacial aterrizó.");
 }
}