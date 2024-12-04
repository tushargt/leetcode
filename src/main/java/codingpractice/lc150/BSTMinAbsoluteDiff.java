package codingpractice.lc150;

/**
 * Minimum Absolute Difference in BST::
 * Given the root of a Binary Search Tree (BST),
 * return the minimum absolute difference between the values of any two different nodes in the tree.
 */

/**
 * Input: root = [1,0,48,null,null,12,49]
 * Output: 1
 */

public class BSTMinAbsoluteDiff {

     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

//    public int getMinimumDifference(TreeNode root) {
//
//    }

    public static void main(String[] args) {
    }
}
