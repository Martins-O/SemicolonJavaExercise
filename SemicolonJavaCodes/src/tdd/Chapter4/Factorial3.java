package tdd.Chapter4;

import java.util.Scanner;

public class Factorial3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a value for X: ");
        int x = scanner.nextInt();

        double sum = 0;
        for (int i = 0; i <= 50; i++) {
            sum = sum + (Math.pow(x, i))/ Factorial1.getFactorial(i);
        }
        System.out.printf("e^%d = %f", x, sum);
    }
}
