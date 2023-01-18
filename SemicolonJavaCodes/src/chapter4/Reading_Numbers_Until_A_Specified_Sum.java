package chapter4;

/*(Reading numbers until a specified sum) Write an application that asks for a number from
        the user and then keeps reading integer values from the user until the sum of those integers equals
        or becomes greater than the value that was input in the beginning.
 */

import java.util.Scanner;

public class Reading_Numbers_Until_A_Specified_Sum {
    // collect user to input integers number
    //infinity iteration.
    //iteration should stop when the sum of the number equals to first number.
    //or greater than
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int number = scanner.nextInt();
        int sum = 0;

        while(sum < number) {
//        for (int j = 0; j < ; j++) {
//
//        }
            System.out.println("Enter the Number: ");
            int num = scanner.nextInt();
           String sumr = "" + num;
           num= Integer.parseInt(sumr);
            System.out.println("Sum is "+ sum);
        }
    }
}
