package codingpractice.BinaryTree;

public class BinarySearchTree {
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while(start <= end) {
            mid = start + (end - start)/2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,6,11,18,24,36,49};
        System.out.println(binarySearch(arr, 36));
        System.out.println(binarySearch(arr, 12));
        System.out.println(binarySearch(arr, 4));
    }
}
