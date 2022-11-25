package Chapter2;
/*(Largest and Smallest Integers) Write an application that reads five integers and determines
and prints the largest and smallest integers in the group. Use only the programming techniques you
learned in this chapter.*/

import java.util.Scanner;

public class FiveIntegers {
    public static void main(String[] args) {
        int largest;
        int smallest;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number1 = input.nextInt();
        System.out.println("Enter the number: ");
        int number2 = input.nextInt();
        System.out.println("Enter the number: ");
        int number3 = input.nextInt();
        System.out.println("Enter the number: ");
        int number4 = input.nextInt();
        System.out.println("Enter the number: ");
        int number5 = input.nextInt();

        largest = number1;
        smallest = number1;

        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
        if (number4 > largest) {
            largest = number4;
        }
        if (number5 > largest) {
            largest = number5;
        }
        System.out.println("The largest number is "+largest);
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number4 < smallest) {
            smallest = number4;
        }
        if (number5 < smallest) {
            smallest = number5;
        }
        System.out.println("The smallest number is "+smallest);
    }
}
