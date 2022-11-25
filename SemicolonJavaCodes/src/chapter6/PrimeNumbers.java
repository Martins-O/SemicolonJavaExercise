package chapter6;

import java.util.Scanner;

public class PrimeNumbers {
    public boolean primeNum(int num){
        if(num / 2  == 0)
            System.out.println("it is prime number");

        return true;
    }

    public static void main(String[] args) {
        PrimeNumbers prime = new PrimeNumbers();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number: ");
        int num = input.nextInt();
        prime.primeNum(num);
    }
}
