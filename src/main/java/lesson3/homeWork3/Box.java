package lesson3.homeWork3;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> fruitList = new ArrayList<>();


    public Box(){

    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public void setFruitList(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }
        public double getWeight() {
            int i = fruitList.size() ;
            return i;

    }

    public void setWeight() {

    }

    @Override
    public String toString() {
        return "Box{" +
                "fruitList=" + fruitList +
                '}';
    }

//    @Override
//    public int compareTo(@NotNull Object o) {
//        return (int) (this.getWeight(getFruitList(Fruit)) - ((Box) o).getWeight(getFruitList(Fruit)));
//    }
}
