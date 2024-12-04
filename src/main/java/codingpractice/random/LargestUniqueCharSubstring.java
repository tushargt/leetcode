package codingpractice.random;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * input: "aab32nfmewlk3rrk3oo"
 * ouput: "ab32nfmewlk3r"
 * You need to return the largest possible contiguous substring from the given
 * input string such that the substring does not contain any repeating characters.
 */

public class LargestUniqueCharSubstring {

    public static String largestUniqueSubstring(String inputString) {
        int start = 0, end = 0;
        char c;
        HashMap<Character, Integer> subStr = new HashMap<>();
        HashMap<String, Integer> resultStr = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            c = inputString.charAt(i);
            if(!subStr.containsKey(c)) {
                subStr.put(c, i);
                end++;
            } else {
                resultStr.put(inputString.substring(start, end), end - start + 1);
                start = i;
                end = i;
            }
        }

        return resultStr.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string:");
        String input = sc.nextLine();
        System.out.println("Largest contiguous substring with unique characters is: " + largestUniqueSubstring(input));
    }

}
