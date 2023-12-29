package lesson3.homeWork3;

public class Orange extends Fruit{
    private double weight;
    public Orange() {
        super(1.5);
        this.weight = 1.5;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
