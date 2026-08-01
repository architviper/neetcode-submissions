/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        boolean left  = isBalanced(root.left);
        boolean right  = isBalanced(root.right);

        int l = heightNode(root.left) ;
        int r = heightNode(root.right);

        return left && right  &&  Math.abs(l - r) <= 1;
    }

    int heightNode(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(heightNode(root.left), heightNode(root.right));
    }
}
