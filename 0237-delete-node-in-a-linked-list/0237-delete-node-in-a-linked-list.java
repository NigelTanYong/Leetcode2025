//overwrite approach, Time (fixed amount of time) and space (operates directly on existing node) complexity O(1)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //overwrite the value of selected node (to delete) with value of next node
        node.val = node.next.val;
        //Link current node to the next of the next node (skipping the that overwrites)
        node.next = node.next.next;
    }
}