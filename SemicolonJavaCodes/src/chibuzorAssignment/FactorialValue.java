package chibuzorAssignment;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {
        Scanner factorial = new Scanner(System.in);
        int number;
        int fact = 1;

        System.out.print("Enter any number:  ");
        number = factorial.nextInt();

        for (int i = 1; i <= number; i++) {
            fact *= i;

        }
        System.out.println("factorial: "+ fact);
    }
}
