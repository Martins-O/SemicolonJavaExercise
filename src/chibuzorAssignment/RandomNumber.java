package chibuzorAssignment;

;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 45;
        for (int i = 0; i <= number; i++) {

            System.out.println("Guess the number Good luck!:  ");
            int guess = input.nextInt();

            if (guess < number) {
                System.out.println("Number is too low, Try Again: ");
            }
            else if (guess > number) {
                System.out.println("Number is too high, Try again: ");
            }
            if (guess == number) {
                System.out.println("Perfect");
                break;
            }
            }
        }
    }