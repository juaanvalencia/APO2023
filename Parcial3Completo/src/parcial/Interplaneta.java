package parcial;

//Clase concreta: NaveInterplanetaria
public class Interplaneta implements NaveEspacial {
 private double peso;
 private double capacidad;
 private double velocidadMaxima;
 private String sistemaPropulsion;

 public Interplaneta(double peso, double capacidad, double velocidadMaxima, String sistemaPropulsion) {
     this.peso = peso;
     this.capacidad = capacidad;
     this.velocidadMaxima = velocidadMaxima;
     this.sistemaPropulsion = sistemaPropulsion;
 }

 @Override
 public void despegar() {
     System.out.println("La nave interplanetaria despegó.");
 }

 @Override
 public void aterrizar() {
     System.out.println("La nave interplanetaria aterrizó.");
 }
}