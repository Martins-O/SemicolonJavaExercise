package practice.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Reverse {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Martins");
        list.add("Daniel");
        list.add("Chinwoke");
        list.add("Raheem");
        list.add("Dean");

        System.out.println("Traversing list through list iterator: ");
// here, element iterates in reverse order
        ListIterator<String> list1 = list.listIterator(list.size());
        while (list1.hasPrevious()){
            String str = list1.previous();

            System.out.println(str);

        }
        System.out.println("traversing list through for loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("traversing list through for-each() method: ");

//        the for each() method is a new feature, introduced in java 8.
        list.forEach(a ->{
//            here, we are using lambda expression
            System.out.println(a);
        });

        System.out.println("traversing list through forEachRemaining() method: ");
        Iterator<String> itr = list.iterator();

        itr.forEachRemaining(a->{
            System.out.println(a);
        });
    }
}
