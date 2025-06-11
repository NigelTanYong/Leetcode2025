//2 point slow-fast approach
//Time complexity: O(n)
//Space complexity: O(1)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;

        for (int i = 0; i<n; i++){ // move fast pointer n steps ahead to have a gap between slow and fast
            fast = fast.next;
        }
        if(fast == null) return head.next; // means node to remove is the head, head.next to remove the head node

        while (fast != null && fast.next != null){//when loop ends, slow will be before the nth node
            slow = slow.next;
            fast = fast.next;
        } 
        if(slow != null && slow.next != null){ // to remove the target node by skipping it
            slow.next = slow.next.next;
        }
        return head;
    }
}