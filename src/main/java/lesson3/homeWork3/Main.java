package lesson3.homeWork3;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес appleBox2: " + appleBox2.getWeight());
        System.out.println("Вес orangeBox: " + orangeBox.getWeight());

        System.out.println("Вес ящика appleBox1 равен appleBox2? " + appleBox1.compare(appleBox2));
        System.out.println("Вес ящика appleBox1 равен orangeBox? " + appleBox1.compare(orangeBox));

        System.out.println("Пересыпаем фрукты из appleBox1 в appleBox2");
        appleBox1.transferFruitsTo(appleBox2);

        System.out.println("Вес appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес appleBox2: " + appleBox2.getWeight());
    }

}
