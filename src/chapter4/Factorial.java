package chapter4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number;
        long factorial = 1;
        System.out.println("input a positive integer: ");
        number = input.nextInt();

        for (long i = 1; i <= number ; i++) {
            factorial = factorial * i;
        }
        System.out.printf("factorial is %d", factorial);
    }
}
