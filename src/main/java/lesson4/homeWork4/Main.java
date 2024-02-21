package lesson4.homeWork4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>(10);
        stringArrayList.add("String");
        stringArrayList.add("Integer");
        stringArrayList.add("Double");
        stringArrayList.add("Boolean");
        stringArrayList.add("Integer");
        stringArrayList.add("Double");
        stringArrayList.add("Double");
        stringArrayList.add("String");
        stringArrayList.add("Integer");
        stringArrayList.add("Integer");
        stringArrayList.add("Integer");
        stringArrayList.add("Boolean");

        System.out.println(stringArrayList);
        System.out.println(stringArrayList.size());

        HashMap<String, Integer> uniqueWords = new HashMap<>();

        for (int i = 0; i < stringArrayList.size() ; i++) {
            if (uniqueWords.containsKey(stringArrayList.get(i))) {
                uniqueWords.put(stringArrayList.get(i), uniqueWords.get(stringArrayList.get(i)) + 1);
            } else {
                uniqueWords.put(stringArrayList.get(i), 1);
            }
        }

        System.out.println(uniqueWords);
    }
}
