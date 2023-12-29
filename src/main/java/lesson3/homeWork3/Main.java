package lesson3.homeWork3;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Weight of appleBox1: " + appleBox1.getWeight());
        System.out.println("Weight of appleBox2: " + appleBox2.getWeight());
        System.out.println("Weight of orangeBox: " + orangeBox.getWeight());

        System.out.println("Is appleBox1 equal to appleBox2? " + appleBox1.compare(appleBox2));
        System.out.println("Is appleBox1 equal to orangeBox? " + appleBox1.compare(orangeBox));

        System.out.println("Transfer fruits from appleBox1 to appleBox2");
        appleBox1.transferFruitsTo(appleBox2);

        System.out.println("Weight of appleBox1: " + appleBox1.getWeight());
        System.out.println("Weight of appleBox2: " + appleBox2.getWeight());
    }
//        Box<Apple> appleBox = new Box<Apple>();
//        appleBox.addFruit(new Apple(1));
//        appleBox.addFruit(new Apple (2));
////        appleBox.addFruit(new Apple(1));
//        System.out.println(appleBox.getWeight());
//        System.out.println(appleBox);
//    }
    
}
