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
        //2 listnode: prehead with value -1, cur points to prehead
        //loop while both list1 and list 2 no the end
        ////check if value of list1 <= value of list2
        ////set cur.next to be list1
        ////forward list1 pointer
        ////vice versa
        ////forward cur pointer
        //check if list1 or list 2 still have remaining node, if so, update them to cur.next
        //return prehead.next

        ListNode prehead = new ListNode(-1);
        ListNode cur = prehead;
        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                cur.next = list1;
                list1 = list1.next;
            }
            else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1==null) cur.next=list2;
        else cur.next = list1;
        return prehead.next;
    }
}