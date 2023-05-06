package chapter6.coinTossing;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    static Scanner input = new Scanner(System.in);


    int headCount = 0;
    int tailCount = 0;

    public Status checkSides(int sides){
        if (sides == 1) {
            headCount++;
            return Status.HEAD;
        }else
            tailCount++;
        return Status.TAIL;
    }
    public int tossCoin(){
        SecureRandom rand = new SecureRandom();
        return 1+ rand.nextInt(2);
    }
    public String userInput(String message){
        System.out.println(message);
        return input.nextLine();
    }
    public int getHeadCount() {
        return headCount;
    }

    public int getTailCount() {
        return tailCount;
    }
}
