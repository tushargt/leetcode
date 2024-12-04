package codingpractice.lc150;

/**
 Moore's Voting Algo:
 An O(n) time complexity approach to find a potential majority element in a given array/list.
 The algo itself iterates through the array once and identifies a potential majority element.
 An additional verification step to check the occurrence of a particular element in an array
 requires us to iterate over the array once more.
 Overall time complexity is O(n).
 We use 2 additional variables. So, this takes O(1) space.
 */

/**
 ALGO:

 def majority_element(sequence):
    count = 0
    candidate = None

    for element in sequence:
        if count == 0:
            candidate = element
            count = 1
        elif element == candidate:
            count += 1
        else:
            count -= 1
    return candidate
 */

public class MajorityElementMooreVotingAlgo {

    private static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];

        // find potential majority element
        for (int i = 1; i< nums.length; i++) {
            if(count == 0) {
                candidate = nums[i];
                count = 1;
            } else if(nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // check number of occurrences of potential majority element
        count = 0;
        for (int num: nums) {
            if(num == candidate)
                count++;
        }

        if(count > nums.length/2)
            return candidate;
        else
            return -1;
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
