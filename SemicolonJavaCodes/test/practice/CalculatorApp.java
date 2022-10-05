package practice;

import java.util.Scanner;

class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner i = new Scanner(System.in);

        System.out.println("Welcome: ");
        int option = i.nextInt();
        if (option == 1) {
            calculator.switchOn();
        }
    }
}
