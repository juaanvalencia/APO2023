package punto3;

public abstract class NaveEspacial {
    // Atributos y constructor
    
    public abstract void atacar();
    
    public abstract void moverse();
    
    public void cargar() {
        System.out.println("La nave está cargando.");
    }
    
    public void descargar() {
        System.out.println("La nave está descargando.");
    }
}
