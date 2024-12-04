package codingpractice.random;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalindromePermutation {
    public static boolean isPalindromePermutation(String inputStr) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (char c: inputStr.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;

        for (int count: frequency.values()) {
            if(count % 2 == 1)
                oddCount++;
        }
        return oddCount <= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string input: ");
        String inputStr = sc.next();

        if(isPalindromePermutation(inputStr))
            System.out.println("The given string " + inputStr + " contains a palindrome permutation");
        else
            System.out.println("The given string " + inputStr + " does not contain any palindrome permutation");
    }
}
