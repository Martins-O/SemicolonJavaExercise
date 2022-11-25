package chibuzorAssignment;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice;

        do {
            System.out.print("Enter the number:  ");
            number = num.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            System.out.print("Do you want to continue y/n? ");
            choice = num.next().charAt(0);
        }
        while (choice=='Y' || choice=='y');
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}
