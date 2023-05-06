package chibuzorAssignment;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int num1;
        int num2;
        char choice;

        do {
            System.out.print("Enter the 1st number:  ");
            num1 = num.nextInt();

            System.out.print("Enter the 2nd number:  ");
            num2 = num.nextInt();

            int total = num1 + num2;
            System.out.println("Total numbers:  " + total);

            System.out.print("do you want to continue y/n");
            choice = num.next().charAt(0);

            System.out.println();
        }
        while(choice=='y' || choice=='Y');
        }
}
