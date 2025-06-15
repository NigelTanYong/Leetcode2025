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

 //Time complexity: O(n), Space Complexity: O(height of tree)
class Solution {//the tree is preordered
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathHelper(root);
        return max;
    }

    int maxPathHelper(TreeNode root){
        if(root == null) return 0;

        int left = Math.max(maxPathHelper(root.left), 0);
        int right = Math.max(maxPathHelper(root.right), 0);

        max = Math.max(max, root.val + left + right); //for the maxSum
        return root.val + Math.max(left, right);// for the recursive helper
    }
}