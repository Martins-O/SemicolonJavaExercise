package chapter5;

import java.util.Scanner;

public class Extremes {
//    (Extremes) Write an application that finds the minimum and maximum amongst several
//    integers and then computes the sum of the two extremes. The user will be prompted to input how
//    many values the application should ask the user to input
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int sum;
    int numOfTimes;

    System.out.println("How many number do you want to input: ");
    numOfTimes = input.nextInt();

        for (int i = 0; i < numOfTimes; i++) {
            System.out.println("Enter the Integer: ");
            number = input.nextInt();
            if(number > max) {
                max = number;
            }
            if(number < min) {
                min = number;
            }
        }
    System.out.println("The largest:" + max);
        System.out.println("The smallest: " + min);

    sum = min + max;
    System.out.println("The sum: " + sum);
    }
}
