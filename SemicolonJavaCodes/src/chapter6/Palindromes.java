package chapter6;

import java.util.Scanner;

public class Palindromes {
    static Scanner in = new Scanner(System.in);
    public void isAPalindrome(){
        int check,sum=0,temp;
        int number = 0;

        temp = number ;
        while(number  > 0){
            check = number  % 10;
            sum = (sum*10) + check;
            number = number /10;
        }
        if(temp == sum)
            System.out.println("This is a palindrome number!");
        else
            System.out.println("Not palindrome!");
    }

    public static void main(String[] args) {
        Palindromes pa = new Palindromes();
        System.out.println("Enter a Palindrome number: ");
        int number = in.nextInt();
        pa.isAPalindrome();
    }
}
