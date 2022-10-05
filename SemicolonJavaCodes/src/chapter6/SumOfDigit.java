package chapter6;
//(Calculating the Sum of Digits) Write a method that takes a four-digit integer value and
//        returns the sum of the digits. For example, given the number 7631, the method should return 17.
//        Incorporate the method into an application that reads a value from the user and displays the result

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number, sum = 0;
        System.out.println("Enter four numbers--> ");
        number = in.nextInt();
//        String s = Integer.toString(number);

        while (number != 0){
            int digit = number % 10;
            sum = sum + digit;

            number = number / 10;

        }
        System.out.println("sum of the digit --> "+sum);
    }
}
