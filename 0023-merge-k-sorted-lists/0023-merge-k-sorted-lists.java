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
        if(lists == null || lists.length ==0){
            return null;
        }
        ListNode mergedList = null;
        for(ListNode list : lists){
            mergedList = mergeHelper(mergedList, list);
        }
        return mergedList; 
    }
    private ListNode mergeHelper(ListNode mergedList, ListNode list){
        ListNode head = new ListNode(0);// initialise the 1st pointer (value does not matter)
        ListNode current = head;
        //merge lists in sorted order
        while(mergedList!=null &&list!=null){ //traversing the linkedlist
            if(mergedList.val < list.val){
                current.next = mergedList;
                mergedList = mergedList.next;
            }
            else{
                current.next = list;
                list = list.next;
            }
            current = current.next; //point to next node
        }

        if(mergedList != null){
            current.next = mergedList;
        }
        else{
            current.next = list; //attaching the list to current
        }
        return head.next;//return the head of the LinkList
    }

}