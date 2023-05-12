package punto2;

public class NaveCombate extends NaveEspacial {
    public NaveCombate(String nombre, String tamaño, String forma, String propulsión, String tipoDeCarga,
                       String usoPrincipal, String tipoDeTripulación, double velocidad, int capacidad,
                       String armamento, String defensas, String sistemaDeComunicaciones,
                       String sistemaDeNavegación) {
        super(nombre, tamaño, forma, propulsión, tipoDeCarga, usoPrincipal, tipoDeTripulación, velocidad,
              capacidad, armamento, defensas, sistemaDeComunicaciones, sistemaDeNavegación);
    }
    
    @Override
    public void moverse() {
        System.out.println("La nave de combate se está moviendo a una velocidad de " + velocidad + " km/s.");
    }
    
    @Override
    public void cargar() {
        System.out.println("La nave de combate no tiene carga que cargar.");
    }
    
    @Override
    public void descargar() {
        System.out.println("La nave de combate no tiene carga que descargar.");
    }
    
    @Override
    public void atacar() {
        System.out.println("La nave de combate está atacando con su armamento " + armamento + ".");
    }
}
