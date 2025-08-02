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
 //Time Complexity: O(n+m), Space Complexity: O(Height of tree) + O(no.of leaves)
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        //collect leafs of both trees in arraylist
        //compare
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        checkLeaf(root1, list1);
        checkLeaf(root2, list2);

        return list1.equals(list2);

       
    }
    //
    public void checkLeaf(TreeNode root, ArrayList<Integer> list){
        //if the current node is a leaf (no left or right child), add its value to the list.
        //Otherwise, traverse the left and right subtrees recursively to find leaves.
        if(root==null) return;
        if(root.left==null && root.right==null){ //if leaf
            list.add(root.val);
        }
        else{ //check recursively
            checkLeaf(root.left, list);
            checkLeaf(root.right, list);
        }
    }
}