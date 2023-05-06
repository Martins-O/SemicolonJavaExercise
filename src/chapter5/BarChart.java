package chapter5;
/*(Bar-Chart Printing Program) One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
number that’s read, your program should display the same number of adjacent asterisks. 
For example, if your program reads the number 7, it should display *******. 
Display the bars of asterisks after
you read all five numbers.*/

import java.util.Scanner;

public class BarChart {
    static Scanner input = new Scanner(System.in);

    public static void barChatDisplay(int userInput){
        System.out.println();
        for (int asterik = 1; asterik < userInput; asterik++) {
            System.out.print("*");
        }

    }

    public static void main(String[] args) {
        int userInput = 0;
        for (int stream = 1; stream <= 5; stream++) {
            System.out.println("Enter number from i to 30: ");
            userInput = input.nextInt();
        }
        barChatDisplay(userInput);
    }
}
