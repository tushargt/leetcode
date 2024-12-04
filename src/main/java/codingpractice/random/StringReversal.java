package codingpractice.random;

import java.util.Scanner;

/**
 * Problem 1:
 * Write a function that takes in a string and returns the reverse of the string.
 * For example, if the input string is "hello world", the function should return "dlrow olleh".
 */

public class StringReversal {

    public String reverseString(String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output.concat(String.valueOf(input.charAt(i)));
        }
        return output;
    }

    public String reverseStringWithSB(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }
        return output.toString();
    }

    public static void main(String[] args) {
        StringReversal sr = new StringReversal();
        System.out.println("Provide an input string:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Input string reversed:\n" + sr.reverseString(input));
        System.out.println("Input string reversed (with StringBuilder):\n" + sr.reverseStringWithSB(input));
    }

    /**
     * In terms of efficiency, using StringBuilder is the most efficient way to concatenate strings in Java, followed by using the concat method, and then the + operator.
     * Here's a summary of their efficiency:
     *     StringBuilder: The most efficient way to concatenate strings in Java. It allows you to concatenate strings without creating any temporary objects at all.
     *     concat: More efficient than using the + operator to concatenate strings, because it creates fewer temporary String objects.
     *     + operator: The least efficient way to concatenate strings in Java. It creates temporary String objects for every concatenation, which can be slow and memory-intensive.
     */
}
