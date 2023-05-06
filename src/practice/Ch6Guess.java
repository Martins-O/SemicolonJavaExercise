package practice;

import java.security.SecureRandom;

public class Ch6Guess {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        for (int i = 1; i <= 20 ; i++) {
            int face = 1 + randomNumbers.nextInt(6);

            System.out.print(face);

            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
