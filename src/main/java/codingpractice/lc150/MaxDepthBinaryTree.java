package codingpractice.lc150;

import com.sun.source.tree.Tree;

/**
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along
 * the longest path from the root node down to the farthest leaf node.
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 *
 * Input: root = [1,null,2]
 * Output: 2
 */

public class MaxDepthBinaryTree {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        //{3,9,20,null,null,15,7};
        TreeNode root1 = new TreeNode(3, new TreeNode(9), new TreeNode(20));
        root1.left.left = null;
        root1.left.right = null;
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        System.out.println("Max depth of the binary tree is: " + maxDepth(root1));

        //{1,null,2};
    }
}
