package chibuzorAssignment;

import java.util.Arrays;

public class ReverseArray {

    static int[] reverse(int[] a) {
        int[] myArray = new int[a.length];
        int j = a.length;
        for (int i = 0; i < a.length; i++) {
            myArray[j - 1] = a[i];
            j = j - 1;
        }
        return myArray;
    }

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        int[] list = reverse(arr);
        System.out.print("Reversed array is: \n");
        for (int k = 0; k < list.length; k++) {
            System.out.printf("%4d",list[k]);
        }
    }
}
