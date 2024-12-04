package codingpractice.lc150;

import java.util.*;

public class StringSubsequenceCheckerMulti {
    private static Map<Character, List<Integer>> preprocessT(String t) {
        Map<Character, List<Integer>> charPositions = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            charPositions.computeIfAbsent(c, key -> new ArrayList<>()).add(i);
        }

        return charPositions;
    }

    private static boolean isSubsequence(String s, String t) {
        Map<Character, List<Integer>> charPositions = preprocessT(t);
        int prev = -1;
        int current = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!charPositions.containsKey(c)) {
                return false;
            } else {
                if(current < prev)
                    return false;
                else {
                    prev = current;
                    //current = charPositions.get(c).get(findPosition(charPositions.get(c), prev));
                }
            }
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
