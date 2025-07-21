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
 //Time Complexity: O(n), Space Complexity: O(1)
class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        //find middle of list
        ListNode slow=head, fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //revers second half
        ListNode secHalf=slow.next;
        slow.next=null;
        ListNode prev=null;
        while (secHalf!=null){
            ListNode temp = secHalf.next; //store next pointer
            secHalf.next = prev; //reverse pointer
            prev=secHalf; // move prev forward
            secHalf=temp; // move secHalf forward
        }
        //merge two halves
        ListNode firstHalf = head;
        while(prev!=null){
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = prev.next;
            firstHalf.next = prev;
            prev.next = temp1;
            firstHalf = temp1;
            prev=temp2;
        }
    }
}