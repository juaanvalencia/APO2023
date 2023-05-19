package parcial;

public class Cohete implements NaveEspacial {
    private String propulsor;

    public Cohete(double peso, double capacidad, double velocidadMaxima, String propulsor) {
        super();
        this.propulsor = propulsor;
    }

    public String getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(String propulsor) {
        this.propulsor = propulsor;
    }

    @Override
    public void despegar() {
        System.out.println("El cohete está despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El cohete está aterrizando.");
    }
}