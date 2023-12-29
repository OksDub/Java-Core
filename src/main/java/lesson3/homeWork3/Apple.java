package lesson3.homeWork3;

public class Apple extends Fruit{
    private double weight;
    public Apple(double weight) {
        super(1.0);
        this.weight = 1.0;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
