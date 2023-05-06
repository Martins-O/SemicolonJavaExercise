package practice.ArrayList;

import java.util.ArrayList;

public class ArrayList_Get_Set {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<>();
        al.add("Cars");
        al.add("Biscuits");
        al.add("Tricycle");
        al.add("Semicolon");
        al.add("Chief");
//        accessing the element
        System.out.println("returning element: "+al.get(2));//it's returning the index input
// changing the element
        al.set(4,"dates");// changing existing list
//        traversing list
        for (String fruit: al) {
            System.out.println(fruit);
        }
    }
}
