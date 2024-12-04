package codingpractice.random;

import java.util.HashSet;

/**
    Given an integer array nums, return true if any value appears at least twice in the array,
    and return false if every element is distinct.

    Example 1:
    Input: nums = [1,2,3,1]
    Output: true

    Example 2:
    Input: nums = [1,2,3,4]
    Output: false

    Constraints:
    1 <= nums.length <= 10^5
    -10^9 <= nums[i] <= 10^9
*/

public class ContainsDuplicate {
    /**
    Below is O(n^2)
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
    */

    //sorting
    /**
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
    }*/

    // using HashSet
    // https://www.youtube.com/watch?v=a3BBbfoijgo&list=PLDEgqz_Jsm9iwntaBH4MNST105S6Ifox6&index=113
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hs.contains(nums[i]))
                return true;
            else
                hs.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums = {1,2,3,1};
        System.out.println("Input: ");
        for (int i: nums) {
            System.out.print(i + " ");
        }
        System.out.println("\nOutput: " + cd.containsDuplicate(nums));
        System.out.println();
        nums = new int[] {1,2,3,4};
        System.out.println("Input: ");
        for (int i: nums) {
            System.out.print(i + " ");
        }
        System.out.println("\nOutput: " + cd.containsDuplicate(nums));
        System.out.println();
        nums = new int[] {1,1,1,3,3,4,3,2,4,2};
        System.out.println("Input: ");
        for (int i: nums) {
            System.out.print(i + " ");
        }
        System.out.println("\nOutput: " + cd.containsDuplicate(nums));
    }
}
