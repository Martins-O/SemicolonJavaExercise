package chapter6;

import java.util.Scanner;

public class DisplayingCharacter {
    static Scanner input = new Scanner(System.in);
    public static void asterik(int time, char fill){
        for (int rows = 0; rows < time; rows++) {
            for (int column = 0; column < time; column++) {
                System.out.print(fill);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        asterik(8, '=');
    }
}
