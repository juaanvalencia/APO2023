package punto2_3;

public class Animal {
    private int weight;
    private int height;
    private double speed;

    public Animal() {
        this.weight = 50;
        this.height = 4;
        this.speed = 2.0;
    }

    public Animal(int weight, int height, double speed) {
        this.weight = weight;
        this.height = height;
        this.speed = speed;
    }

    public double getTime(double miles) {
        return miles / speed;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public double getSpeed() {
        return speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}

