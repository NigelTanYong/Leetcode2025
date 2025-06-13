//tortoise and hare method, time complexity: O(n)---traverse entire list, Space complexity: O(1)
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
        if(head == null || head.next == null) return false;
        ListNode slowNode = head;
        ListNode fastNode = head.next;
        while (slowNode != fastNode){
            if(fastNode == null || fastNode.next == null) return false;
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return true;
    }
}