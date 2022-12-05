package chapter4;
//(Palindromes) A palindrome is a sequence of characters that reads the same backward as forward. For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
//        and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome. If the number is not five digits long, display an error message and allow the user to enter
//        a new value.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original = "";
        Scanner input = new Scanner(System.in);


       while (original.length() != 5){
           System.out.println("Enter a five digit number: ");
           original = input.nextLine();
           if (original.length() == 5) {
               if ((original.charAt(0) == original.charAt(4)) && (original.charAt(1) == original.charAt(3))) {
                   System.out.println("This is a palindrome");
               }
               else {
                   System.out.println("This is not a palindrome");
               }
           }
           else {
               System.out.println("Invalid input");

           }
       }
    }


}
