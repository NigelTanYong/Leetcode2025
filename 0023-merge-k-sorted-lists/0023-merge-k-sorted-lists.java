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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode mergedList = null;
        
        // Start with the first list
        for (ListNode list : lists) {
            mergedList = mergeTwoLists(mergedList, list);
        }
        
        return mergedList;
    }

    // Merge two sorted linked lists
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode startPoint = new ListNode(0); //new node with value 0
        ListNode current = startPoint;

        // Merge both lists in sorted order
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // If any list still has remaining nodes, append them
        if (l1 != null) {
            current.next = l1; //means attach the rest of 1 at current
        } else {
            current.next = l2;
        }

        return startPoint.next;
    }

}