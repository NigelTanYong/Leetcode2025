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
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> s = new Stack<>();
        TreeNode pre = null;
        while(root != null || !s.isEmpty()){
            while (root !=null){ //to pop all the way the the left side of tree
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            if(pre!=null && root.val<= pre.val) return false;
            pre = root; //take from the popped (which beginning is left node then root)
            root = root.right;
        }
        return true;
    }
}