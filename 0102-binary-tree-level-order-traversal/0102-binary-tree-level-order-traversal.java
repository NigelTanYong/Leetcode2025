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

 //to revise....
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> li1 = new ArrayList<>();
        if (root == null)
            return li1;

        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);

        while (!qu.isEmpty()) {
            List<Integer> li = new ArrayList<>();
            int size = qu.size();

            for (int i = 0; i < size; i++) {
                TreeNode present = qu.remove();
                li.add(present.val);

                if (present.left != null) {
                    qu.add(present.left);
                }
                if (present.right != null) {
                    qu.add(present.right);
                }
            }

            li1.add(li);
        }

        return li1;
    }
}