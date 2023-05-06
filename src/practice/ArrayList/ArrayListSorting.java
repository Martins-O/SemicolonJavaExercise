package practice.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 * the java.util. package provides a utility class collections,
 * which has the static method sort(): Using the collections.sort() method,
 * we can easily sort the Arraylist.
 */

public class ArrayListSorting {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
//        sorting the list
        Collections.sort(list);
//        Traversing list through the for-each loop
        for (String fruit: list) {
            System.out.println(fruit);
        }
        System.out.println();
        System.out.println("Sorting numbers......");
        System.out.println();

//            creating a list of numbers
        List<Integer> list1 = new ArrayList<>();
        list1.add(22);
        list1.add(34);
        list1.add(11);
        list1.add(44);
        Collections.sort(list1);

        for (Integer numbers: list1) {
            System.out.println(numbers);
        }

    }
}
