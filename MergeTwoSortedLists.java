/* Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists. */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        
        ListNode solution; 
        
        if (l1.val <= l2.val){
            solution = l1;
            solution.next = mergeTwoLists(l1.next, l2);
        }
        else{
            solution = l2; 
            solution.next = mergeTwoLists(l1, l2.next);
        }
        
        return solution;
    }
}