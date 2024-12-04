package codingpractice.string;

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String input) {
        //clean up string of all non-alphanumeric characters
        //convert all characters to lowercase before the palindrome check
        if (null == input)
            return false;

        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        //in the modified string, check individual characters from the start against characters at the end
        //incrementing one char at a time from start and decrementing one char at a time till we reach the middle
        int length = input.length();
        for (int i = 0; i < length/2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.print("Enter a string (type '!' to exit): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("!"))
                break;
            if (input.trim().isBlank()) {
                System.out.println("Please enter a valid string.");
                continue;
            }
            System.out.println(isPalindrome(input) ? "The given input is a palindrome." : "The given input is not a palindrome.");
        } while (true);

        scanner.close();
    }
}
