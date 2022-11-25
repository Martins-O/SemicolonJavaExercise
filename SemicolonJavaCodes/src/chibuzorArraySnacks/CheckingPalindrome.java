package chibuzorArraySnacks;

import java.util.Scanner;

public class CheckingPalindrome {
    public static boolean isPalindrome(String palindromeChecking) {
        StringBuilder reversed = new StringBuilder();
        boolean answer = false;

        for (int i = palindromeChecking.length() - 1; i >= 0; i--) {
            reversed.append(palindromeChecking.charAt(i));
        }
        if (palindromeChecking.equals(reversed.toString())) {
            answer = true;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word to check for palindrome: ");
        String word = input.nextLine();
        word = word.toLowerCase();
        boolean A = isPalindrome(word);
        System.out.println(A);
    }
}
