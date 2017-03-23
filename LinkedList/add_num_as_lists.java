# Add two numbers as lists

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode a, ListNode b) {
	    ListNode ref = new ListNode(0);
	    ListNode p1 = ref;
	    if(a == null && b == null){
	        return null;
	    }
	    if(a == null){
	        return b;
	    }
	    if(b == null){
	        return a;
	    }
	    int sum = 0;
	    while(a != null || b != null){
	        if(a != null)
	        {
	            sum = sum + a.val;
	            a = a.next;
	        }
	        if(b != null)
	        {
	            sum = sum + b.val;
	            b = b.next;
	        }
	        
            p1.next = new ListNode(sum%10);
            p1 = p1.next;
            sum = sum/10;
	    }
	    if(sum != 0)
	    {
	        p1.next = new ListNode(sum);
	    }
	    return ref.next;
	}
}
