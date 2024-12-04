package codingpractice.random;

import java.util.Scanner;

/**
 * reverse array in place
 */
public class ReverseArray {
    public static void reverseArray(int[] inputArray) {
        int left = 0;
        int right = inputArray.length - 1;
        while (left < right) {
            inputArray[left] = inputArray[left] + inputArray[right] - (inputArray[right] = inputArray[left]);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Given array:");
        for (int i: arr) {
            System.out.print(i + " ");
        }

        reverseArray(arr);
        System.out.println("\nReversed array:");
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}
