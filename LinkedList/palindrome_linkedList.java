# Palindrome list

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {

	// Reverses the given list
    public ListNode reverseList(ListNode l2){
        ListNode prev = null;
        ListNode curr = l2;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        l2 = prev;
        return l2;
    }
    public int lPalin(ListNode A) {
        if(A == null || A.next == null){
            return 1;
        }
		// Split in two lists
        ListNode tort = A;
        ListNode hare = A.next;
        while(hare != null || hare.next != null){
            tort = tort.next;
            hare = hare.next.next;
        }
        ListNode l1 = A;
        ListNode l2 = tort.next;
        tort.next = null;
		
		// Reverse the second list
        l2 = reverseList(l2);
		
		// Compare elements in the two lists
        while(l1 != null || l2 != null){
            if(l2 != null){
                if(l1.val != l2.val){
                    return 0;
                }
                l2 = l2.next;
            }
            l1 = l1.next;
        }
        return 1;
    }
}
