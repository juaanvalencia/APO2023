package punto2;

public class NaveColonizadora extends NaveEspacial {
    private int capacidadColonos;
    
    public NaveColonizadora(String nombre, String tamaño, String forma, String propulsión, String tipoDeCarga,
                            String usoPrincipal, String tipoDeTripulación, double velocidad, int capacidad,
                            String armamento, String defensas, String sistemaDeComunicaciones,
                            String sistemaDeNavegación, int capacidadColonos) {
        super(nombre, tamaño, forma, propulsión, tipoDeCarga, usoPrincipal, tipoDeTripulación, velocidad,
              capacidad, armamento, defensas, sistemaDeComunicaciones, sistemaDeNavegación);
        this.capacidadColonos = capacidadColonos;
    }
    
    @Override
    public void moverse() {
        System.out.println("La nave colonizadora se está moviendo a una velocidad de " + velocidad + " km/s.");
    }
    
    @Override
    public void cargar() {
        System.out.println("La nave colonizadora está cargando suministros y colonos.");
    }
    
    @Override
    public void descargar() {
        System.out.println("La nave colonizadora está descargando colonos y suministros.");
    }
    
    @Override
    public void atacar() {
        System.out.println("La nave colonizadora no está armada y no puede atacar.");
    }
    
    public void colonizar() {
        System.out.println("La nave colonizadora está iniciando la colonización con una capacidad de " +
                capacidadColonos + " colonos.");
    }
}
