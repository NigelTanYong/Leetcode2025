//Time: O(n) — traverse list a few times but linear overall.
//Space: O(1) — only pointers, no extra data structures.
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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find the middle of the linked list (slow will point to middle)
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; // move twice as fast
        }

        // Step 2: Reverse the second half
        ListNode secondHalfHead = reverseList(slow);

        // Step 3: Compare the first half and the reversed second half
        ListNode firstHalfPointer = head;
        ListNode secondHalfPointer = secondHalfHead;
        boolean palindrome = true;
        while (secondHalfPointer != null) {
            if (firstHalfPointer.val != secondHalfPointer.val) {
                palindrome = false;
                break;
            }
            firstHalfPointer = firstHalfPointer.next;
            secondHalfPointer = secondHalfPointer.next;
        }

        

        return palindrome;
    }

    // Helper function to reverse the linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nextTemp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTemp;
        }
        return prev;
    }
}