package tdd.ChibuzorAssignment;

import java.util.Scanner;

public class SumOfTenNaturalNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number = num.nextInt();

        int sum=10;
        while (sum<= number){
            sum = sum + number;
            number++;
        }
        System.out.println("sum of natural number is: " +sum);

    }
}
