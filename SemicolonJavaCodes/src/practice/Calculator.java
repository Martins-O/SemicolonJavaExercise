package practice;

import java.util.Scanner;

public class Calculator {
    Scanner in = new Scanner(System.in);

    public void switchOn(){
        System.out.println("""
                1: Addition.
                2: Subtraction.
                3: Multiplication.
                4: Square root.
                5: Division.
                6: Square^.
                99: Switch Off.
                """);
        System.out.println("press any key from 1 -> 6 to calculate or 99 to switch the calculator off: ");
        int option = in.nextInt();

        switch (option){
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                square_root();
                break;
            case 5:
                division();
                break;
            case 6:
                square();
                break;
            case 99:
                switchOff();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + option);
        }
    }

    public void addition() {
        int sum = 0, count = 0, number = 0;
        System.out.println("Enter the number or -1 to quit: ");
        number = in.nextInt();

        while (number != -1){
            sum = sum + number;
            count++;

            System.out.println("Enter the number or -1 to quit: ");
            number = in.nextInt();
            if (number == -1){
                break;
            }
        }
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println();
        System.out.println();
        System.out.println();
        switchOn();
    }
    public void subtraction() {
        int count = 0, number = 0;

        int firstNumber = 0, secondNumber = 0;
        System.out.println("Enter the first number ");
        firstNumber = in.nextInt();
        System.out.println("Enter the second number  ");
        secondNumber = in.nextInt();
        int total = 0;


        int total1 = 0;
        while (number != -1) {
            total = firstNumber - secondNumber;

            System.out.println("Enter the next number or -1 to quit: ");
            number = in.nextInt();
            if (number == -1) break;
            total1 = total - number;

        }
        System.out.println("The sum of the numbers is: " + total1);
        System.out.println();
        System.out.println();
        System.out.println();
        switchOn();
    }

    public void multiplication(){
        int number = 0;

        int firstNumber, secondNumber;
        System.out.println("Enter the first number ");
        firstNumber = in.nextInt();
        System.out.println("Enter the second number  ");
        secondNumber = in.nextInt();
        int total;


        int total1 = 0;
        while (number != -1) {
            total = firstNumber * secondNumber;

            System.out.println("Enter the next number or -1 to quit: "+total);
            number = in.nextInt();
            if (number == -1) break;
            total1 = total * number;

        }
        System.out.println("The sum of the numbers is: " + total1);
        System.out.println();
        System.out.println();
        System.out.println();
        switchOn();

    }
    public void square_root() {
        int number = 0;
        System.out.println("Enter number: ");
        number = in.nextInt();
        while (number != -1) {
            System.out.println("Answer or press -1 to quit: " + Math.sqrt(number));
            number = in.nextInt();
            if (number == -1) {
                break;
            }
        }
        System.out.println("Answer or press -1 to quit: " + Math.sqrt(number));
        switchOn();
    }
    public void division(){

    }
    public void square(){

    }
    public void switchOff(){

    }

}
