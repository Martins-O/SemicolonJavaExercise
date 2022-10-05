package chapter6;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){
        int answer, guess;

        Scanner in = new Scanner(System.in);

        Random rand = new Random();

        boolean correct = false;

        answer = 760;

        while (!correct){
            System.out.println("Guess a number between and 1000: ");
            guess = in.nextInt();

            if(guess > answer){
                System.out.println("Too high, try high");
            } else if (guess < answer) {
                System.out.println("Too low, try again");
            }else {
                System.out.println("YES! Congratulations");

                correct = true;
            }
        }
        System.exit(0);
    }
}
