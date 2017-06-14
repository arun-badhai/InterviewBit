# Remove Nth node from list end

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode removeNthFromEnd(ListNode a, int b) {
	    if(a == null){
	        return null;
	    }
	    ListNode curr = a;
	    ListNode prev = curr;
	    ListNode temp = a;
	    int count=0;
	    while(temp != null){
	        count++;
	        temp = temp.next;
	    }
	    b=count-b;
	    if(b==0){
	        return a.next;
	    }
	    int i=0;
	    while(i != b && curr != null){
	        prev = curr;
	        curr = curr.next;
	        i++;
	    }
	    if(i<b || curr == null){
	        return a.next;
	    }
	    if(curr.next == null){
	        prev.next = null;
	        return a;
	    }
	    prev.next = curr.next;
	    curr.next = null;
	    return a;
	}
}
