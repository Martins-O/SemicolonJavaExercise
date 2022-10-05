package practice.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListP {
    public static void main(String[] args) {
//        ArrayList<Integer> al = new ArrayList<>();//ArrayList class declaration.
//        Java generic collections
        ArrayList<String>  list = new ArrayList<>();//creating arraylist
        list.add("mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

//        traversing list through iterator
        Iterator itr = list.iterator();//getting the iterator
        while(itr.hasNext()) {// check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
//        Printing the arraylist object
//        System.out.println(list); is used to print the list
//        iterating Arraylist using iterator

        }
    }
}
