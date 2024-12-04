package codingpractice.lc150;

/**
 * Given an integer array nums and an integer val,
 * remove all occurrences of val in nums in-place.
 * The order of the elements may be changed.
 * Then return the number of elements in nums which are not equal to val.
 *
 * Consider the number of elements in nums which are not equal to val be k,
 * to get accepted, you need to do the following things:
 *
 * Change the array nums such that the first k elements
 * of nums contain the elements which are not equal to val.
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */

import java.util.Arrays;

/**
 * Example::
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */

public class RemoveElement {
/*
    private int removeElemRearrangeArray(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;

        if(j < 0) {
            return 0;
        }

        while(nums[j] == val && i < j) {
            j--;
        }

        while(i < j) {
            if(nums[i] == val) {
                nums[i++] = nums[j--];
            } else {
                i++;
            }
        }

        return j + 1;
    }

 */

    private int removeElemRearrangeArray(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
            } else {
                i++;
            }
        }

        return i;
    }


    public static void main(String[] args) {
        //int[] nums = {0,1,2,2,3,0,4,2};
        int[] nums = {1};
        int val = 1;
        RemoveElement removeElement = new RemoveElement();
        int k = removeElement.removeElemRearrangeArray(nums, val);
        System.out.println("Number of elements not equal to given value: " + k);
        System.out.println("Rearranged array: " + Arrays.toString(nums));
    }
}
