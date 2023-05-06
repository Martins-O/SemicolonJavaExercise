package Chapter2;
//(Arithmetic) Write an application that asks the user to enter two integers, obtains them from
//        the user and prints the square of each, the sum of their squares, and the difference of the squares (first
//        number squared minus the second number squared). Use the techniques shown in Fig. 2.7.

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("number1: ");
        num1 = input.nextInt();

        System.out.println("num2: ");
        num2 = input.nextInt();

        int squ1 = num1 * num1;
        int squ2 = num2 * num2;

        System.out.printf("%d%n, %d%n" , squ1, squ2);

        int sum = squ1 + squ2;
        System.out.printf("%d%n", sum);

        int minus = squ1 - squ2;
        System.out.printf("%d%n", minus);
    }
}
