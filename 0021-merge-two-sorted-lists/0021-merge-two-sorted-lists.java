//Time complexity O(m+n) m: no. of nodes is list 1 and n: no. of nodes in list 2
//Space complexity O(1)
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prehead = new ListNode(-1);
        ListNode cur = prehead;

        while(list1 != null && list2 !=null){
            if(list1.val <= list2.val){
                cur.next = list1;
                list1 = list1.next;
            } else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1 == null) cur.next = list2;
        else cur.next = list1;

        return prehead.next; // cuz it's prehead
    }
}