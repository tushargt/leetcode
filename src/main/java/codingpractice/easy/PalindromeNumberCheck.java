package codingpractice.easy;

import java.util.Scanner;

/**
 * Given an integer x, return true if x is a
 *
 * , and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 *
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 *
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 *
 *
 * Constraints:
 *
 *     -231 <= x <= 231 - 1
 *
 * Follow up: Could you solve it without converting the integer to a string?
 */

public class PalindromeNumberCheck {

    private static boolean isPalindromeNumber(int number) {
        /*
        //approach 1 - convert to String
        String num =  String.valueOf(number);
        String numRev = new StringBuilder(num).reverse().toString();
        return num.equals(numRev);
        */

        if (number == 0)
            return true;
        else if (number < 0 || number % 10 == 0)
            return false;

        int reversedHalf = 0;
        while (number > reversedHalf) {
            reversedHalf = reversedHalf * 10 + number % 10;
            number /= 10;
        }

        return  number == reversedHalf || number == reversedHalf/10;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter an integer: ");
        number = input.nextInt();
        if(isPalindromeNumber(number))
            System.out.println("Entered input is a palindrome number.");
        else
            System.out.println("Entered input is not a palindrome number.");
    }
}
