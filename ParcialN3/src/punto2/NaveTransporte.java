package punto2;

public class NaveTransporte extends NaveEspacial {
    public NaveTransporte(String nombre, String tamaño, String forma, String propulsión, String tipoDeCarga,
                          String usoPrincipal, String tipoDeTripulación, double velocidad, int capacidad,
                          String armamento, String defensas, String sistemaDeComunicaciones,
                          String sistemaDeNavegación) {
        super(nombre, tamaño, forma, propulsión, tipoDeCarga, usoPrincipal, tipoDeTripulación, velocidad,
              capacidad, armamento, defensas, sistemaDeComunicaciones, sistemaDeNavegación);
    }
    
    @Override
    public void moverse() {
        System.out.println("La nave transporte se está moviendo a una velocidad de " + velocidad + " km/s.");
    }
    
    @Override
    public void cargar() {
        System.out.println("La nave transporte está cargando su carga.");
    }
    
    @Override
    public void descargar() {
        System.out.println("La nave transporte está descargando su carga.");
    }
    
    @Override
    public void atacar() {
        System.out.println("La nave transporte no está armada y no puede atacar.");
    }
}
