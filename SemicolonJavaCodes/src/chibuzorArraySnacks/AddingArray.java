package chibuzorArraySnacks;

public class AddingArray {
    static void addingArray(int[] myList){
        int total = 0;
        for (int element : myList) {
            total += element;
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        int[] myList = {12, 45, 23, 21 ,32, 76};
        addingArray(myList);
    }
}
