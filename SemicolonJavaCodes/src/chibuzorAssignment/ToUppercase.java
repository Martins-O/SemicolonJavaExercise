package chibuzorAssignment;

import java.util.Scanner;

public class ToUppercase {
        static String convert(String str) {
            char upper[] = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {

                if (i == 0 && upper[i] != ' ' ||
                        upper[i] != ' ' && upper[i - 1] == ' ') {

                    if (upper[i] >= 'a' && upper[i] <= 'z') {
                        upper[i] = (char)(upper[i] - 'a' + 'A');
                    }
                }

                else if (upper[i] >= 'A' && upper[i] <= 'Z')

                    upper[i] = (char)(upper[i] + 'a' - 'A');
            }

            String up = new String(upper);
            return up;
        }

     public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            System.out.println(convert(str));
     }

}
