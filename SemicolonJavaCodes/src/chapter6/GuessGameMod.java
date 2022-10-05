package chapter6;
//(Guess-the-Number Modification) Modify the program of Exercise 6.30 to count the num
//        ber of guesses the player makes. If the number is 10 or fewer, display Either you know the secret
//        or you got lucky! If the player guesses the number in 10 tries, display Aha! You know the secret!
//        If the player makes more than 10 guesses, display You should be able to do better! Why should it
//        take no more than 10 guesses? Well, with each “good guess,” the player should be able to eliminate
//        half of the numbers, then half of the remaining numbers, and so on.

import java.util.Random;
import java.util.Scanner;

public class GuessGameMod {
    public static void main(String[] args) {
        int number = 0;

        Scanner in = new Scanner(System.in);
        Random ran = new Random();
//
//        System.out.println("Guess number from 1 - 1000 --> ");
//        number = in.nextInt();
        int max = 0;
        int answer = 800;
        while (number != 800)  {
            System.out.println("Guess number from 1 - 1000 --> ");
            number = in.nextInt();
            max++;

            if(number > answer){
                System.out.println("Too high, try high");
            } else if (number < answer) {
                System.out.println("Too low, try again");
            } else{
                System.out.println("YES! Congratulations");
            }
        }
        System.out.println();
        if(max < 10){
            System.out.println("Either you know the secret or you got lucky!");
        }
        if(max == 10){
            System.out.println("Aha! You know the secret!");
        }
        if(max > 10){
            System.out.println("You should be able to do better!");
        }
    }
}
