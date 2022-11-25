package martinsProject;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] myList = new String[5];
        System.out.println("Enter "+myList.length+" problems you have in your life @ semicolon");
        for (int pro = 0; pro < myList.length; pro++)
            myList[pro] = input.nextLine();
        System.out.println(Arrays.toString(myList));
    }
}