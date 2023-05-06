package chapter7.diceRoll;

import static java.lang.System.*;
public class DiceRoll {



    public static void tabularDisplay(int[] outcomes){
        out.print("SUM"+ "\t"+ "NUMBER OF TIMES");
        for (int position = 0; position < outcomes.length; position++){
            out.println(position+2);
            out.println(outcomes[position]);
        }
    }
    public static void numberOfTimesPossibleSum(int sum, int[] outcome){
        for (int position = 0; position < outcome.length ; position++) {
            if (sum == position+2) {
                outcome[position]++;
                break;
            }
        }
    }
    public static void outcomeDisplay(){
        int[] outcomeArray = {2,3,4,5,6,7,8,9,10,11,12};
        for (int a = 1; a <= 6; a++) {
            out.print(a);
        }
        out.println( );
        for(int b = 1; b <= 6; b++) {
            out.print(b);

            for (int c = 1; c <= 6; c++) {
                for (int d = 1; d <=6 ; d++) {
                    if (d + c == outcomeArray[d-1]) {
                        out.print(outcomeArray[d]);
                    }
                }
            }
            out.print(" ");
        }
    }
    static int calculateSumOfTwoDice(int roll1, int roll2) {
        return roll1 + roll2;
    }
}
