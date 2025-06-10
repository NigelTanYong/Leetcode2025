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
        ListNode prev = null;
        ListNode cur = head;
        //traverse the linkedlist
        while(cur!=null){
            /* visualisation in first iteration
            1->2->3->4
            cur points 1
            cur.next points to null at beginning
            cur points to 2
            null<-1<-2->3->4
            ....
            */
            ListNode temp = cur.next;
            cur.next = prev; //null<-1
            prev = cur; //pointer at 1
            cur = temp; //pointer at 2
        }
        return prev;

    }
}