package chibuzorArraySnacks;

import java.util.ArrayList;

public class ElementsInList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(10);
        list.add(13);

        if(list.indexOf(6) >= 0){
            System.out.println("5 exists in the list");
        }
        else
            System.out.println("5 does not exist");
    }
}
