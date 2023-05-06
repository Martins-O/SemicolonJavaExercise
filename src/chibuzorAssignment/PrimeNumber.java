package chibuzorAssignment;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("Enter the postive number:  ");
        number = scanner.nextInt();

        boolean num = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                num = false;
                break;
            }
        }
        if( num && number > 1){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }

}
