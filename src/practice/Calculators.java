package practice;

import java.util.Scanner;

public class Calculators {
    public static void main(String[] args) {
        int num1;
        int num2;
        double ans;
        char option;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        System.out.println("Enter an operator (+, * , -, /): ");
        option = input.next().charAt(0);

        switch (option) {
            case '+' -> ans = num1 + num2;
            case '*' -> ans = num1 * num2;
            case '-' -> ans = num1 - num2;
            case '/' -> ans =(double) num1 / num2;
            default -> {
                System.out.println("Error! Enter an operator");
                return;
            }
        }
        System.out.println("The result is: ");
        System.out.println(num1 + " " + option + " " + num2 + " = " + ans);
    }

    public int addTwoNumbers(int i, int i1) {
        int num = i + i1;
        return num;
    }
}
