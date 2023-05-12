package punto4;

import punto2.NaveEspacial;

public abstract class NaveColonizadora extends NaveEspacial {
    private int capacidadDeColonos;
    private String tipoDeCarga;
    
    public NaveColonizadora(String nombre, String tamaño, String forma, String propulsión, String usoPrincipal,
                            String tipoDeTripulación, double velocidad, int capacidadDeColonos,
                            String sistemaDeComunicaciones, String sistemaDeNavegación, String tipoDeCarga) {
        super(nombre, tamaño, forma, propulsión, usoPrincipal, tipoDeTripulación, tipoDeCarga, velocidad,
              capacidadDeColonos, sistemaDeComunicaciones, sistemaDeNavegación, tipoDeCarga, tipoDeCarga);
        this.capacidadDeColonos = capacidadDeColonos;
        this.tipoDeCarga = tipoDeCarga;
    }
    
    @Override
    public void moverse() {
        System.out.println("La nave colonizadora se está moviendo a una velocidad de " + velocidad + " km/s.");
    }
    
    @Override
    public void atacar() {
        System.out.println("La nave colonizadora no tiene armamento y no puede atacar.");
    }
    
    public void colonizar() {
        System.out.println("La nave colonizadora está llevando " + capacidadDeColonos + " colonos y " +
                tipoDeCarga + " para la colonización del planeta.");
    }
}

