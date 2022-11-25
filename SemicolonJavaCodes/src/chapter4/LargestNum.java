package chapter4;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int largest = 0;
        int counter  = 0;
        int smallest = 0;
        for (counter = 1; counter <= 10; counter++) {
            System.out.println("Enter Any integer: ");
            number = input.nextInt();
            if (number > largest) {
                largest = number;
            }
            if (counter == 1) {
                smallest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.printf("Smallest is: %d%n", smallest);
        System.out.printf("largest is: %d", largest);
    }
}
