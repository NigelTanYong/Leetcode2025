//Recursive approach
//Time Complexity O(n)
//Space Complexity O(n) due to recursion call stack
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(head == nullptr || head->next == nullptr)
            return head;
        
        //reverse rest of list (recursive)
        ListNode* newHead = reverseList(head->next);

        //reverse logic
        head->next->next = head; //last node point back to head to complete
        head->next = nullptr; //prevent cycle

        return newHead;

    }
};