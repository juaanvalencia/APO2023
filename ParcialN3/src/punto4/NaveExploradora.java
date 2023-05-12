package punto4;

import punto2.NaveEspacial;

public abstract class NaveExploradora extends NaveEspacial {
    private String tipoDeInstrumentos;
    
    public NaveExploradora(String nombre, String tamaño, String forma, String propulsión, String tipoDeCarga,
                           String usoPrincipal, String tipoDeTripulación, double velocidad,
                           String armamento, String defensas, String sistemaDeComunicaciones,
                           String sistemaDeNavegación, String tipoDeInstrumentos) {
        super(nombre, tamaño, forma, propulsión, usoPrincipal, tipoDeTripulación, tipoDeInstrumentos, velocidad, capacidad, armamento,
              defensas, sistemaDeComunicaciones, sistemaDeNavegación);
        this.tipoDeInstrumentos = tipoDeInstrumentos;
    }
    
    @Override
    public void moverse() {
        System.out.println("La nave exploradora se está moviendo a una velocidad de " + velocidad + " km/s.");
    }
    
    @Override
    public void atacar() {
        System.out.println("La nave exploradora no tiene armamento y no puede atacar.");
    }
    
    public void explorar() {
        System.out.println("La nave exploradora está utilizando " + tipoDeInstrumentos +
                " para explorar el sistema estelar.");
    }
}
