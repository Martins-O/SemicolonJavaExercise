package chapter14;

/*(Manipulating Strings) Write an application that reads a list of
strings from the user, stores them in an array of strings, and prints
the ones with special characters and the ones without special
characters in separate lines. Your application should read strings
from the user until they enter ‘#’.Any character that is not a letter
or a number should be treated as a special character. When printin
ghe list of strings, the first character should be in uppercase and
the rest of the characters should be in lower case.
Your application should also count the number of strings with
and without special characters and print the counts in the output.*/

import java.util.Scanner;

public class Manipulating {
    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>();
        String[] strings = new String[100];

        int special_count = 0;
        int regular_count = 0;

        Scanner input = new Scanner(System.in);
        String user_input;
        int counter = 0;

        System.out.println("Enter a string or '#' to quit: ");
        user_input = input.nextLine();

        while(!user_input.equals("#")){
            strings[counter] = user_input;
            counter++;

            System.out.println("Enter a string or '#' to quit: ");
            user_input = input.nextLine();
        }
        for (int i = 0; i < counter; i++) {
            boolean special = false;
            for (int j = 0; j < strings[i].length();j++) {
                if (!Character.isLetter(strings[i].charAt(i)) && !Character.isWhitespace(strings[i].charAt(j))) {
                    special = true;
                    break;
                }
            }
            if (special){
                special_count++;

                System.out.println(strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1).toLowerCase());
            }else {
                regular_count++;
                System.out.println(strings[i].toLowerCase());
            }
        }
        System.out.println("Numbers of strings with special characters => " + special_count);
        System.out.println("Numbers of strings without special characters => " + regular_count);
    }
}
