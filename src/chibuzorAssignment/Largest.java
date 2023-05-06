package chibuzorAssignment;

import java.util.Arrays;

public class Largest {
     static int[] largestPairSum(int[] array) {
        int element = 0;
        int largest = array.length == 1 ? array[0] + array[1] : array[0];
        for (int index = 0; index < array.length; index++) {
            int sum = array[element] + array[index];
            if (sum > largest) {
                largest = sum;
                if (array[element] < array[index]) {
                    element = index;
                }
            }
        }
        return new int[]{largest};
     }


    public static void main(String[] args) {
        int[] list= {1,100,3,4,5,12,89};
        System.out.println(Arrays.toString(largestPairSum(list)));
    }
}
