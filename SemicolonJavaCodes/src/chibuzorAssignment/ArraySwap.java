package chibuzorAssignment;

import java.util.Arrays;

public class ArraySwap {
    static int[] swap(int[] list1){
        int temp = list1[0];
        list1[0] = list1[1];
        list1[1] = temp;
        return list1;
    }
}
