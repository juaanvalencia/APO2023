package punto4;

import punto2.NaveEspacial;

public abstract class NaveCombate extends NaveEspacial {
    private String armamento;
    private String defensas;
    
    public NaveCombate(String nombre, String tamaño, String forma, String propulsión, String usoPrincipal,
                       String tipoDeTripulación, double velocidad, String armamento, String defensas,
                       String sistemaDeComunicaciones, String sistemaDeNavegación) {
        super(nombre, tamaño, forma, propulsión, usoPrincipal, tipoDeTripulación, sistemaDeNavegación, velocidad,
              capacidad, sistemaDeComunicaciones, sistemaDeNavegación, sistemaDeNavegación, sistemaDeNavegación);
        this.armamento = armamento;
        this.defensas = defensas;
    }
    
    @Override
    public void moverse() {
        System.out.println("La nave de combate se está moviendo a una velocidad de " + velocidad + " km/s.");
    }
    
    @Override
    public void atacar() {
        System.out.println("La nave de combate está atacando con " + armamento + ".");
    }
    
    public void defenderse() {
        System.out.println("La nave de combate está utilizando " + defensas + " para defenderse.");
    }
}

