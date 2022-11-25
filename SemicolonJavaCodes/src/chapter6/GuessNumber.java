package chapter6;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){
        int guess = 0;

        Scanner in = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        Random rand = new Random();
        random.nextInt(1, 1000);

        while (guess != random.nextInt()){
            System.out.println("Guess a number between and 1000: ");
            guess = in.nextInt();

            if(guess > random.nextInt()){
                System.out.println("Too high, try high");
            } else if (guess < random.nextInt()) {
                System.out.println("Too low, try again");
            }else {
                System.out.println("YES! Congratulations");
                break;
            }
        }
    }
}
