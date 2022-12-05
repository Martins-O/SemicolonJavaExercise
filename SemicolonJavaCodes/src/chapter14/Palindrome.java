package chapter14;

/*(Palindromes) A palindrome is a word that reads the same both forward and backward, such
as ‘radar’and ‘madam’. Write an application to check if a string entered by the user is a palindrome
or not.*/

public class Palindrome {

    public boolean isPalindrome(String word){
        String reverse = "";
        for (int check = word.length()-1; check >= 0; check--){
            reverse = reverse + word.charAt(check);
        }
        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("Yes! "+word+" is a palindrome");
            return true;

        }
        else {
            System.out.println("No! "+word+" is not a palindrome");
            return false;
        }
    }
}
