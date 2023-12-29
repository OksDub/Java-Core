package lesson3.homeWork3;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        double totalWeight = 0.0f;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void transferFruitsTo(Box<T> anotherBox) {
        if (this == anotherBox) {
            return;
        }

        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
//    private ArrayList<T> fruitList = new ArrayList<>();
//
//
//    public Box(){
//
//    }
//
//    public ArrayList<T> getFruitList() {
//        return fruitList;
//    }
//
//    public void setFruitList(ArrayList<T> fruitList) {
//        this.fruitList = fruitList;
//    }
//        public double getWeight() {
//            double i = fruitList.getWeight();;
//            return i;
//
//    }
//
//    public void setWeight() {
//
//    }
//    public void addFruit(T fruit) {
//        fruitList.add(fruit);
//    }
//
//    @Override
//    public String toString() {
//        return "Box{" +
//                "fruitList=" + fruitList +
//                '}';
//    }
//
////    @Override
////    public int compareTo(@NotNull Object o) {
////        return (int) (this.getWeight(getFruitList(Fruit)) - ((Box) o).getWeight(getFruitList(Fruit)));
////    }
}
