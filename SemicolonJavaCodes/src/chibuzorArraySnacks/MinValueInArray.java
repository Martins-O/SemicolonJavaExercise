package chibuzorArraySnacks;

import java.util.Scanner;

public class MinValueInArray {
    public static double minArray(){
        double[] myList = {1,2,3,4,5,6};
        double max = myList[0];
        int indexOfMax = 0;
        for (int i = 1; i < myList.length;i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(minArray());
    }
}
