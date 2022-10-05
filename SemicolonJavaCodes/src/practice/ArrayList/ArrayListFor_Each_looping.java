package practice.ArrayList;

import java.util.ArrayList;

public class ArrayListFor_Each_looping {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("mango");
        list.add("Banana");
        list.add("Grapes");
        list.add("Pearl");
        list.add("PawPaw");
// traversing through for-each loop array
        for (String fruit: list) {
            System.out.println(fruit);
        }
    }
}
