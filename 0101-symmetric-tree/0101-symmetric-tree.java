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

 //Time complexity: O(n), Space complexity: O(h)
class Solution {//preordered tree
    public boolean isSymmetric(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        return helper(left,right);
    }
    private boolean helper(TreeNode left, TreeNode right){
        if(left == null && right == null){ //empty always symmetric
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val != right.val){ //check if value same
            return false;
        }
        return helper(left.left, right.right) && helper(left.right, right.left);
    }
}