package practice.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListingSorting2 {
    int rollNo;
    String name;
    int age;

    public ArrayListingSorting2(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
//        creating an object.
        ArrayListingSorting2 arrayListingSorting2 = new ArrayListingSorting2(200, "Marins", 27);
//        creating a arraylist class.
        ArrayList<ArrayListingSorting2> si = new ArrayList<>();
        si.add(arrayListingSorting2);
//        getting iterator
        Iterator itr = si.iterator();
//        traversing elements of arraylist object.
        while (itr.hasNext()){
            ArrayListingSorting2 ai = (ArrayListingSorting2)itr.next();
            System.out.println(arrayListingSorting2.rollNo+" "+ arrayListingSorting2.age+" "+arrayListingSorting2.name);
        }
    }
}
