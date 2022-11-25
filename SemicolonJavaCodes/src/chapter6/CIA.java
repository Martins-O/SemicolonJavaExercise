package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CIA {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int rand1 = random.nextInt(1,9);
        int rand2 = random.nextInt(1,9);
        int rand3 = random.nextInt(1,9);
        int rand4 = random.nextInt(1, 9);
        int ans = rand2 *  rand1;
        int an = rand4 * rand3;
        start(ans,rand1,rand2);
        repeat(rand3,rand4);
    }
    static int repeat( int rand1, int rand2){
        int ans= 0;
        while(true){
            System.out.printf("what is %d * %d: ", rand1, rand2);
            int number = input.nextInt();
            if (number == ans) {
                System.out.println("Good Job!");
                break;
            } else
                System.out.println("Try Again!");
        }
        return ans;
    }
    static void start(int ans, int rand1, int rand2) {
        while (true) {
            System.out.printf("what is %d * %d: ", rand1, rand2);
            int number = input.nextInt();
            if (number == ans) {
                System.out.println("Good Job");
                break;
            } else
                System.out.println("Try Again!");
        }
    }
}
