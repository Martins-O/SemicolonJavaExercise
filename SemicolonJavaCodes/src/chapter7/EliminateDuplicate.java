package chapter7;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class EliminateDuplicate {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArray = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        removeDuplicates(myArray);
    }

    public static void removeDuplicates(@NotNull int[] myArray){
        int numbers = 0;
        int elements;
        for (elements = 0; elements < myArray.length; elements++) {
            System.out.println("Enter the numbers between 10 -100: ");
            numbers = input.nextInt();
            for (int number = elements; number >= 0; number--) {
                if (numbers != myArray[number]) {
                    myArray[elements] = numbers;
                } else {
                    myArray[elements] = -1;
                    break;
                }
            }
        }
        for (int array : myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
