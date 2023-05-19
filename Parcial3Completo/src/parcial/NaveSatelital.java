package parcial;

//Clase concreta: Satelite
public class NaveSatelital implements NaveEspacial {
 private double peso;
 private double capacidad;
 private double velocidadMaxima;
 private String orbita;

 public NaveSatelital(double peso, double capacidad, double velocidadMaxima, String orbita) {
     this.peso = peso;
     this.capacidad = capacidad;
     this.velocidadMaxima = velocidadMaxima;
     this.orbita = orbita;
 }

 @Override
 public void despegar() {
     System.out.println("El satélite despegó.");
 }

 @Override
 public void aterrizar() {
     System.out.println("El satélite aterrizó.");
 }
}