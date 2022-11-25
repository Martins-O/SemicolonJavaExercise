package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDuplicating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int numbers = 0;

        int elements;
        for (elements = 0; elements < myArray.length; elements++) {
            System.out.println("Enter the numbers between 10 -100: ");
            numbers = input.nextInt();
//            while (numbers < 10 || numbers > 100) {

                for (int number = elements; number >= 0; number--) {
                    if (numbers != myArray[number]) {
                        myArray[elements] = numbers;
                    } else {
                        myArray[elements] = -1;
                        break;
                    }
                }
//            }
        }
        for (int array : myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
