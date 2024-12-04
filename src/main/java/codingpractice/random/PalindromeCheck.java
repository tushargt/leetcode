package codingpractice.random;

/**
 * Input - A String
 * Output - true/false depending on whether the input string is a palindrome
 */

public class PalindromeCheck {
    public static boolean isPalindrome(String input) {
        boolean isPalindrome = true;
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = input.length();
        for (int i = 0; i < length/2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        String test1 = "Malayalam";
        String test2 = "A man, a plan, a canal, Panama!";
        String test3 = "test";
        System.out.println(test1 + " : " + isPalindrome(test1));
        System.out.println(test2 + " : " + isPalindrome(test2));
        System.out.println(test3 + " : " + isPalindrome(test3));
    }
}
