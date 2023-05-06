package practice;

import java.security.SecureRandom;

public class RollingDice {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int [] frequency = new int[7];

        for (int i = 0; i <= 60_000_000; i++) {
            ++frequency[1 + randomNumbers.nextInt(6)];
        }
        System.out.printf("%s%10s%n", "face","frequency");
        for (int face = 0; face < frequency.length; face++) {
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }
    }
}
