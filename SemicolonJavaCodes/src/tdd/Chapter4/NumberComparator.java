package tdd.Chapter4;
//(Creating a Comparator) Write an application that works as a comparator. Your program
//        should read two numbers from the user and print 0 if they are equal to each other, 1 if the first
//        number is greater, and –1 if the second number is greater.

import java.util.Scanner;

public class NumberComparator {
    //collect integer from the users,
//    if the number is the same print 0
//    if the first number is greater than the second one print 1.
//    if the second number is greater than the first one print -1

    public static void main(String[] args) {
        Scanner both = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int number = both.nextInt();
        System.out.println("Enter the second integer:  ");
        int num = both.nextInt();

        if(num == number){
            System.out.println(0);
        } else if (number > num) {
            System.out.println(1);
        }else if(num > number){
            System.out.println(-1);
        }
    }
}
