package codingpractice.lc150;

/**
 * You are given two integer arrays nums1 and nums2,
 * sorted in non-decreasing order, and two integers
 * m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function,
 * but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n,
 * where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */


/**
 * Example 1:
 *
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */

import java.util.Arrays;

/**
 * Constraints:
 *
 * nums1.length == m + n
 * nums2.length == n
 * 0 <= m, n <= 200
 * 1 <= m + n <= 200
 * -109 <= nums1[i], nums2[j] <= 109
 */
public class MergedSortedArray {

    public void mergeArrays(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Index of last non-zero element in nums1
        int j = n - 1; // Index of last element in nums2
        int k = m + n - 1; // Index of last element in merged array

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

/*
    public void mergeArrays(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int temp = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                i++;
            } else {
                temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                i++;
                j++;
            }
        }

        for (int k = j; k < n; k++) {
            nums1[i++] = nums2[k];
        }
    }

 */


    public static void main(String[] args) {
        int[] nums1 = {1,2,4,0,0,0,0};
        int m = 3;
        int[] nums2 = {2,4,6,8};
        int n = 4;

        MergedSortedArray mergedSortedArray = new MergedSortedArray();
        mergedSortedArray.mergeArrays(nums1, m, nums2, n);
        System.out.println("Sorted output: " + Arrays.toString(nums1));
    }
}
