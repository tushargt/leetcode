package codingpractice.lc150;

/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by
deleting some (can be none) of the characters without disturbing the relative positions
 of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false

Constraints:
0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters.

Follow up:
Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want
to check one by one to see if t has its subsequence. In this scenario, how would you
change your code?
*/

import java.util.Scanner;

public class StringSubsequenceChecker {
    public static boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
            return true;

        if(s.length() > t.length())
            return false;

        int i = 0;
        int j = 0;
        boolean found = false;
        for (char c: s.toCharArray()) {
            while (i < t.length()) {
                if (c == t.charAt(i++)) {
                    found = true;
                    j++;
                    break;
                }
            }
            //early termination check
            if(!found)
                return false;
            if(s.length() - j > t.length() - i)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the main string (t): ");
            String t = sc.nextLine();
            System.out.print("Enter the test string (s): ");
            String s = sc.nextLine();
            System.out.println("Is s a subsequence of t: " + isSubsequence(s, t));
            System.out.print("Enter Y/y to continue: ");
        } while(sc.nextLine().equalsIgnoreCase("Y"));
    }
}
