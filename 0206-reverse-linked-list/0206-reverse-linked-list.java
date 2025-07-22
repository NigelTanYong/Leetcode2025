//Iterative approach
//Time complexity - O(n)
//Space complexity - O(1) no new data structure introduce
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
    public ListNode reverseList(ListNode head) {
        //constraint allows 0 no. of nodes. so we need to have edge case to return if null or 1 node
        //loop while cur not null
        ////initialise a temp listnode to hold cur.next
        ////set the cur.next to prev --reversing pointer
        ///forward  prev pointer to cur
        ////forward cur pointer to temp
        //return prev
        ListNode prev =null;
        ListNode cur = head;
        if(head == null || head.next == null) return head;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;

    }
}