package poo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	
	public Coche () {
		
		 ruedas = 4;
		 largo = 3000;
		 ancho = 400;
		 motor = 2000;
		 peso_plataforma = 6000;
	}
	
	public String dime_asientos1() {//GETTER
		
		return "La plataforma del vehiculo tiene " + motor + " motor " + ruedas + " ruedas " + " Mide " + largo/1000 + " metros con un ancho de " + ancho + "cm y un peso de plataforma de " + peso_plataforma + "kg";
		
	}
	
	public void establece_color(String color_coche) {//SETTER
		
		color = color_coche;
	}
	
	public String dime_color() {
		return "el color del coche es " + color;
	}
	
	public void configura_asientos(String asientos_cuero) {//SETTER
		
		 if (asientos_cuero == "no") {
			 
			  this.asientos_cuero = true;
		 }else {
			 this.asientos_cuero = false;
		 }
		
	}
	
	public String dime_asientos() {//GETTER
		
		if(asientos_cuero == true) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie";
		}
	}
	
	public void configura_climatizador(String climatizar) {//SETTER
		
		 if(climatizador == true) {
			 
			 this.climatizador = true;
		 }else {
			 this.climatizador = false;
			 
		 }
	}
	
	public String dime_climatizador() {//GETTER
		
		if(climatizador == true) {
			return " El coche tiene climatizador ";
		}else {
			return "El coche tiene climatizador ";
			
		}
	}
	
	public String dime_peso_coche() {//SETTER + GETTER
		
		int peso_carroceria = 600; 
		
		peso_total = peso_plataforma + peso_carroceria;
		
		if(asientos_cuero == true) {
			
			peso_total = peso_total + 60;
		}
		
		if(climatizador == true) {
			peso_total = peso_total + 20;
		}
		
		return "El peso del coche es " + peso_total;
	}
	
	public int precio_coche() {
		int precio_final = 10000;
		
		if(asientos_cuero == true) {
			precio_final += 2000;
		}
		
		if (climatizador == true) {
			
			precio_final += 1500;
		}
		
		return precio_final;
	}
}
