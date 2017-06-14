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
    public ListNode reverse(ListNode temp){
        if(temp == null || temp.next == null){
            return temp;
        }
        ListNode prev = null;
	    ListNode curr = temp;
	    ListNode next;
	    while(curr != null){
	        next = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = next;
	    }
	    return prev;
    }
    public int lPalin(ListNode A) {
        if(A == null){
            return 1;
        }
        if(A.next == null){
            return 1;
        }
        ListNode prev = A;
        ListNode curr = prev.next;
        while(curr != null && curr.next != null){
            prev = prev.next;
            curr = curr.next.next;
        }
        ListNode start = A;
        ListNode mid = reverse(prev.next);
        prev.next = null;
        while(start != null && mid != null){
            if(start.val != mid.val){
                return 0;
            }
            start = start.next;
            mid = mid.next;
        }
        return 1;
    }
}
