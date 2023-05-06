package practice;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three floating-point values separated by spaces: ");
         double number = input.nextDouble();
         double number1 = input.nextDouble();
         double number2 = input.nextDouble();
        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);
        double result = maximum(number, number1, number2);
        System.out.println("Maximum is: " + result);
    }

    private static double maximum(double number, double number1, double number2) {
        double maximumValue = number;

        if(number1 > maximumValue){
            maximumValue = number1;
        }
        if (number2 == maximumValue) {
            maximumValue = number2;
        }
        return maximumValue;
    }
}
