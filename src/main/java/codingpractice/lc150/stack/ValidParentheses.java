package codingpractice.lc150.stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:
- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    private static boolean isValidParentheses(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c: input.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        System.out.println("Given input forms a valid parentheses string? "
                             + String.valueOf(isValidParentheses(input)));
    }
}
