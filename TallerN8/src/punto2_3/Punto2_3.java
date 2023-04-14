package punto2_3;

public class Punto2_3 {
    public Punto2_3() {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        double speed1 = animal1.getSpeed();
        double speed2 = animal2.getSpeed();

        System.out.println("El animal 1 tiene una velocidad de " + speed1);
        System.out.println("El animal 2 tiene una velocidad de " + speed2);
    }
}

