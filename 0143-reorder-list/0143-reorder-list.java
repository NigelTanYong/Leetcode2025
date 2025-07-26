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
        //notice that we can reverse second half then merge to reorder this list
        //1: find the middle of list
        //2: reverse the second half
        //3: merge

        if(head==null || head.next==null) return;
        //1 - find middle of list
        ListNode slowNode = head, fastNode = head;
        while(fastNode!=null && fastNode.next!=null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next; //traverse 2 times faster
        }
        //2 - reverse second half
        ListNode secHalf = slowNode.next;
        slowNode.next = null; // prevent cycle
        ListNode prev = null;
        while(secHalf!=null){
            ListNode temp = secHalf.next;
            secHalf.next = prev;
            prev=secHalf;
            secHalf=temp;
        }
        //3 - merge
        ListNode firstHalf = head;
        //at this point prev pointing to the  1st of sechalf
        while(prev!=null){
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = prev.next;
            firstHalf.next = prev;
            prev.next=temp1;//point prev to the next firstHalf
            firstHalf=temp1; //forward firstHalf pointer
            prev = temp2; //forward prev
        }
        
    }
}