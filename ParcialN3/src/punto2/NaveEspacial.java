package punto2;

public abstract class NaveEspacial {
    protected String nombre;
    protected String tamaño;
    protected String forma;
    protected String propulsión;
    protected String tipoDeCarga;
    protected String usoPrincipal;
    protected String tipoDeTripulación;
    protected double velocidad;
    protected static int capacidad;
    protected String armamento;
    protected String defensas;
    protected String sistemaDeComunicaciones;
    protected String sistemaDeNavegación;
    
    public NaveEspacial(String nombre, String tamaño, String forma, String propulsión, String tipoDeCarga,
                        String usoPrincipal, String tipoDeTripulación, double velocidad, int capacidad,
                        String armamento, String defensas, String sistemaDeComunicaciones,
                        String sistemaDeNavegación) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.forma = forma;
        this.propulsión = propulsión;
        this.tipoDeCarga = tipoDeCarga;
        this.usoPrincipal = usoPrincipal;
        this.tipoDeTripulación = tipoDeTripulación;
        this.velocidad = velocidad;
        this.capacidad = capacidad;
        this.armamento = armamento;
        this.defensas = defensas;
        this.sistemaDeComunicaciones = sistemaDeComunicaciones;
        this.sistemaDeNavegación = sistemaDeNavegación;
    }
    
    public abstract void moverse();
    public abstract void cargar();
    public abstract void descargar();
    public abstract void atacar();
}
