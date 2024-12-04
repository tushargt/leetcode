package codingpractice.lc150;

/**
 * Example:
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * word1:  a   b   c   d
 * word2:    p   q
 * merged: a p b q c   d
 */

/**
 * Constraints:
 *
 * 1 <= word1.length, word2.length <= 100
 * word1 and word2 consist of lowercase English letters.
 */

public class MergeStringsAlternately {

    //first attempt
    public String mergeAlternatelyFirst(String word1, String word2) {
        String result = "";
        int length1 = word1.length();
        int length2 = word2.length();
        int n = Math.min(length1, length2);

        for (int i = 0; i < n; i++) {
            result = result.concat(Character.toString(word1.charAt(i))
              .concat(Character.toString(word2.charAt(i))));
        }

        if (length1 > length2)
            return result.concat(word1.substring(n, length1));
        else if (length1 < length2)
            return result.concat(word2.substring(n, length2));

        return result;
    }

    //concise solution with StringBuilder
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int i=0;
        while(i<word1.length() && i<word2.length()) {
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
            i++;
        }
        str.append(word1.substring(i));
        str.append(word2.substring(i));

        return str.toString();
    }

    public static void main(String[] args) {
        MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();
        System.out.println("Merged: " + mergeStringsAlternately.mergeAlternately("abcdef", "pqrs"));
    }

}
