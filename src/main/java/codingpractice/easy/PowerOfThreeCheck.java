package codingpractice.easy;

import java.util.Scanner;

/**
 * Given an integer n, return true if it is a power of three.
 * Otherwise, return false.
 *
 * An integer n is a power of three,
 * if there exists an integer x such that n == 3^x.
 *
 *  Follow up: Could you solve it without loops/recursion?
 */

public class PowerOfThreeCheck {

    //using recursion
    public static boolean isPowerOfThree(int n) {
        if(n == 1)
            return true;
        else if (n <= 0 || n % 3 != 0)
            return false;
        else
            return isPowerOfThree(n / 3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter an integer: ");
        number = input.nextInt();
        if(isPowerOfThree(number))
            System.out.println("Entered input is a power of 3.");
        else
            System.out.println("Entered input is not a power of 3.");
    }
}
