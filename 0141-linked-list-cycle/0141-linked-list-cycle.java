//tortoise and hare method, O(n)
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next == null) return false;

        ListNode slowerNode = head;
        ListNode fasterNode = head.next;

        while(slowerNode != fasterNode){
            if(fasterNode == null || fasterNode.next == null) return false;
            slowerNode = slowerNode.next;
            fasterNode = fasterNode.next.next;
        }
        return true;
    }
}