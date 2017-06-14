# Reorder a given linked list
i.e. L0--L1--L2--L3 will become L0--L3--L1--L2

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
	public ListNode reorderList(ListNode a) {
	    ListNode prev = a;
	    ListNode curr = a;
	    if(a == null || a.next == null){
	        return a;
	    }
	    while(curr != null && curr.next != null){
	        prev = prev.next;
	        curr = curr.next.next;
	    }
	    ListNode start = a;
	    ListNode mid = reverse(prev.next);
	    prev.next = null;
	    ListNode first = new ListNode(0);
	    ListNode value = first;
	    while(start != null || mid != null){
	        if(start != null){
	            first.next = start;
	            first = first.next;
	            start = start.next;
	        }
	        if(mid != null){
	            first.next = mid;
	            first = first.next;
	            mid = mid.next;
	        }
	    }
	    return value.next;
	}
}
