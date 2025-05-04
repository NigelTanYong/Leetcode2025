/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public var val: Int
 *     public var next: ListNode?
 *     public init() { self.val = 0; self.next = nil; }
 *     public init(_ val: Int) { self.val = val; self.next = nil; }
 *     public init(_ val: Int, _ next: ListNode?) { self.val = val; self.next = next; }
 * }
 */
class Solution {
    func mergeKLists(_ lists: [ListNode?]) -> ListNode? { //_means no need to put internal parameter name
        if(lists.isEmpty || lists.count == 0){
            return nil
        }
        var mergedList : ListNode?
        for var list in lists{
            mergedList = mergeHelper(&mergedList, &list)
        }
        return mergedList
    }

    func mergeHelper(_ mergedList: inout ListNode?, _ list: inout ListNode?) -> ListNode? {
        var starter = ListNode(0) // Create a dummy node with value 0
        var current = starter      // Pointer to build the merged list

        // Iterate while neither of the lists is exhausted
        while let n1 = mergedList, let n2 = list {
            if n1.val < n2.val {
                current.next = n1
                mergedList = n1.next // Move to next node in mergedList
            } else {
                current.next = n2
                list = n2.next // Move to next node in list
            }
            current = current.next! // Move the current pointer
        }

        // At this point, one of the lists is exhausted, we append the remainder of the other list
        current.next = mergedList ?? list
        
        return starter.next // Return the merged list, excluding the dummy node
    }
}