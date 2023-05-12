package punto4;

import punto2.NaveEspacial;

public abstract class NaveDeCarga extends NaveEspacial {
    private String tipoDeCarga;
    private int capacidad;
    
    public NaveDeCarga(String nombre, String tamaño, String forma, String propulsión, String tipoDeCarga,
                       String usoPrincipal, String tipoDeTripulación, double velocidad, int capacidad) {
        super(nombre, tamaño, forma, propulsión, usoPrincipal, tipoDeTripulación, tipoDeTripulación, velocidad, capacidad, tipoDeTripulación, tipoDeTripulación, tipoDeTripulación, tipoDeTripulación);
        this.tipoDeCarga = tipoDeCarga;
        this.capacidad = capacidad;
    }
    
    @Override
    public void moverse() {
        System.out.println("La nave de carga se está moviendo a una velocidad de " + velocidad + " km/s.");
    }
    
    @Override
    public void atacar() {
        System.out.println("La nave de carga no tiene armamento y no puede atacar.");
    }
    
    public void cargarCarga() {
        System.out.println("La nave de carga está cargando " + tipoDeCarga + " con una capacidad de " +
                capacidad + " toneladas.");
    }
}

