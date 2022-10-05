package Chapter2;
//(Comparing Integers) Write an application that asks the user to enter one integer, obtains
//        it from the user and displays whether the number and its square are greater than, equal to, not equal
//        to, or less than the number 100. Use the techniques shown in Fig. 2.15.

import java.util.Scanner;

public class Comparing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Enter the number you like: ");
        num1 = input.nextInt();

        System.out.println("Enter the number you wish: ");
        num2 = input.nextInt();

        int squ = num1 * num1;
        int squ2 = num2 * num2;

        if (squ == squ2)
            System.out.printf("%d == %d%n", squ, squ2);

        if (squ >= squ2)
            System.out.printf("%d >= %d%n", squ, squ2);

        if (squ <= squ2)
            System.out.printf("%d <= %d%n", squ, squ2);

        if (squ != squ2)
            System.out.printf("%d != %d%n", squ, squ2);
    }
}
