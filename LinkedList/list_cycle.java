# List Cycle
(Floyd's Cycle approach)

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode a) {
	    if(a == null || a.next == null){
	        return null;
	    }
	    ListNode prev = a;
	    ListNode curr = a;
	    ListNode ans = new ListNode(-1);
	    while(curr != null && curr.next != null){
	        prev = prev.next;
            curr = curr.next.next;
            if(prev == curr){
                prev = a;
                while(prev != curr){
                    prev = prev.next;
                    curr = curr.next;
                }
                ans.next = new ListNode(prev.val);
                ans = ans.next;
                break;
            }
	    }
	    if(ans.val == -1){
	        return null;
	    }
	    return ans;
	}
}
