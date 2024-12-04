package codingpractice.lc150;

import java.util.Arrays;

/**
 Given an array nums of size n, return the majority element.
 The majority element is the element that appears more than ⌊n / 2⌋ times.
 You may assume that the majority element always exists in the array.

 Example 1:
 Input: nums = [3,2,3]
 Output: 3

 Example 2:
 Input: nums = [2,2,1,1,1,2,2]
 Output: 2
 */

// This solution is O(nlogn) as we need to sort first
// Also, this solution works because of the guarantee that there is a majority element
// Use Moore's Voting Algo (Another Java class written for this)
public class MajorityElement {

    private static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if(nums.length % 2 == 1 ) {
            return nums[nums.length/2];
        } else if(nums.length == 2) {
            return nums[0];
        } else {
            if(nums[0] == nums[nums.length/2 - 1]) {
                return nums[0];
            } else {
                return nums[nums.length/2];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {3,2,3};
        int[] nums2 = {2,2,1,1,1,2,2};
        int[] nums3 = {1,9,1,9,2,9,2,9,4,9};
        System.out.println("nums1: majority element = " + majorityElement(nums1));
        System.out.println("nums2: majority element = " + majorityElement(nums2));
        System.out.println("nums3: majority element = " + majorityElement(nums3));
    }
}
