package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CIA636 {
    public static int negative;

    public static int response;
    static Scanner input = new Scanner(System.in);

     static SecureRandom rand = new SecureRandom();
        static void response() {
            response = rand.nextInt(1, 4);

            if (response >= 1 && response <= 4) {
                switch (response) {
                    case 1 -> System.out.println("Very Good!");
                    case 2 -> System.out.println("Excellent!");
                    case 3 -> System.out.println("Nice work!");
                    case 4 -> System.out.println("Keep up the good work!");
                }
            }
        }
        static void negative() {
            negative = rand.nextInt(1, 4);

            if (negative >= 1 && negative <= 4) {
                switch (negative) {
                    case 1 -> System.out.println("No! please try again!");
                    case 2 -> System.out.println("Wrong! Try once more!");
                    case 3 -> System.out.println("Don't give up!");
                    case 4 -> System.out.println("No! keep trying");
                }
            }
        }
    public static void main(String[] args) {
    SecureRandom random = new SecureRandom();
        int rand = random.nextInt(1,9);
        int rand2 = random.nextInt(1,9);
        int rand3 = random.nextInt(1,9);
        int rand4 = random.nextInt(1, 9);
        response = random.nextInt(1, 4);
        negative = random.nextInt(1, 4);
        int ans = rand2 *  rand;
        int an = rand4 * rand3;
        start(ans,rand,rand2);
        repeat(an,rand3,rand4);
    }
    static void repeat(int ans, int rand1, int rand2){
        while(true){
            System.out.printf("what is %d * %d: ", rand1, rand2);
            int number = input.nextInt();
            if (number == ans) {
                response();
                break;
            } else negative();
        }
    }
    static void start(int ans, int rand1, int rand2) {
        while (true) {
            System.out.printf("what is %d * %d: ", rand1, rand2);
            int number = input.nextInt();
            if (number == ans) {
                response();
                break;
            } else negative();
        }
    }
}
