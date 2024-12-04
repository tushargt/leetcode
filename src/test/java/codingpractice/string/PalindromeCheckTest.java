package codingpractice.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeCheckTest {
    @Test
    public void testPalindrome() {
        String input = "madam";
        assertTrue(PalindromeCheck.isPalindrome(input), input + " should be a palindrome");
    }

    @Test
    public void testEmptyString() {
        String input = "";
        assertTrue(PalindromeCheck.isPalindrome(input), "Empty string should be considered a palindrome");
    }

    @Test
    public void testSpecialCharacters() {
        String input = "A man, a plan, a canal: Panama";
        assertTrue(PalindromeCheck.isPalindrome(input), input + " should be a palindrome");
    }

    @Test
    public void testNonPalindrome() {
        String input = "Test";
        assertFalse(PalindromeCheck.isPalindrome(input), input + " should not be a palindrome");
    }

}
