package codingpractice.lc150;

/*
Given two strings ransomNote and magazine,
return true if ransomNote can be constructed by
using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true

Constraints:
1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
 */

import java.util.HashMap;
import java.util.Scanner;

public class RansomNote {
    private static boolean canConstruct(String note, String magazine) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            charCountMap.merge(c, 1, Integer::sum);
            //charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : note.toCharArray()) {
            if (charCountMap.containsKey(c) && charCountMap.get(c) > 0) {
                charCountMap.merge(c, -1, Integer::sum);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ransom note?: ");
        String note = sc.nextLine();
        System.out.print("Magazine?: ");
        String magazine = sc.nextLine();
        System.out.println("Ransom Note = " + note + "; Magazine = " + magazine
          + "\nFor the above input, can ransom note be constructed from the magazine? " +
                             String.valueOf(canConstruct(note, magazine)).toUpperCase());
    }
}
