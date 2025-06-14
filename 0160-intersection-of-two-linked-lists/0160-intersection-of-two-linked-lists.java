//Time Complexity: O(n + m)
//Space Complexity: O(1) --2pointers used only
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //boundary
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a!=b){
            /*both switchs to one another when end of node so that equal distance travelled */
            if(a == null){ //when traverse to end of HeadA
                a = headB;
            }
            else{
                a = a.next;
            }
            if(b == null) { // when traverse to end of headB
                b = headA;
            }
            else{
               b =b.next;
            }
        }
        return a; //when the intersection eventually meet
    }
}