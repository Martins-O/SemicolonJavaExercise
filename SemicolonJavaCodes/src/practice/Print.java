package practice;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//this is to allow user to enter.
        int number1;
        int number2;

        System.out.println("Enter first number--> ");
        number1 = input.nextInt();

        System.out.println("Enter first number--> ");
        number2 = input.nextInt();

        if (number1 == number2) {
            System.out.printf("%d == %d%n", number1 , number2);
            }
        if (number1 != number2) {
            System.out.printf("%d != %d%n", number1 , number2);
            }

        if (number1 < number2) {
            System.out.printf("%d < %d%n", number1, number2);
        }
        if (number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2);
        }
        if (number1 <= number2) {
            System.out.printf("%d <= %d%n", number1, number2);
        }

        if (number1 >= number2) {
            System.out.printf("%d >= %d%n", number1, number2);
        }
        number1 = 1;


    }

}
