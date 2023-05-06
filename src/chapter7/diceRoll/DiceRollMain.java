package chapter7.diceRoll;

import java.util.Arrays;
import java.util.Random;


import static chapter7.diceRoll.DiceRoll.*;

public class DiceRollMain {
    public static void main(String[] args) {
        Random random  = new Random();
        int dice1 ;
        int dice2 ;
        int[] outcomes = new int[11];
        for (int position = 0; position < 36_000_000; position++) {
            dice1 = 1 + random.nextInt(6);
            dice2 = 1 + random.nextInt(6);
            int sum = calculateSumOfTwoDice(dice1, dice2);
            numberOfTimesPossibleSum(sum, outcomes);
        }
        System.out.print(Arrays.toString(outcomes));
        tabularDisplay(outcomes);
        outcomeDisplay();
    }

}
