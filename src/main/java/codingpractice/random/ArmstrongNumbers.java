package codingpractice.random;

import java.util.Scanner;

/**
 * this problem is for only 3 digit nos
 * 153 = 1^3+5^3+3^3 => armstrong nos
 */

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter a 3-digit number: ");
        num = in.nextInt();
        System.out.println(num + " is an Armstrong number? " + isArmstrongNumber(num));
    }

    /**
     * Checks if a number is an Armstrong number
     *
     * @param num
     * @return
     */
    private static boolean isArmstrongNumber(int num) {
        int temp = num;
        int sum = 0;
        while(temp > 0) {
            sum += (int)Math.pow(temp%10, 3);
            temp /= 10;
        }
        return sum == num;
    }
}
