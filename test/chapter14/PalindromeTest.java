package chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

    @Test
    public void isAPalindromeTest(){
        Palindrome palindrome = new Palindrome();

        assertTrue(palindrome.isPalindrome("Madam"));
    }

    @Test
    public void isNotAPalindromeTest(){
        Palindrome palindrome = new Palindrome();

        assertFalse(palindrome.isPalindrome("martins"));
    }

}