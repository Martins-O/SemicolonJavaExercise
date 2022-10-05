package chapter6;

import java.util.Scanner;

public class LeapYearTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year;
        System.out.print("Enter the year -> ");
        year = in.nextInt();

        if(((year % 4 == 0) && (year % 100 != 0)) || ((year & 400) == 0)){
            System.out.println("It is A LEAP YEAR!");
        }else
            System.out.println("It is NOT A LEAP YEAR");
    }
}
