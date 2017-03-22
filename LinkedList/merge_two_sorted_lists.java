# Merging two sorted linked lists

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode a, ListNode b) {
	
		// Reference nodelist
	    ListNode noderef = new ListNode(0);
		
		// New nodelist to add values
	    ListNode node = noderef;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	    ListNode start = a;
	    ListNode end = b;
		
		// Iterate till one of them is not null
	    while(start != null && end != null){
		
			// Copy the smallest of the two values to the new nodelist
	        if(start.val < end.val){
	            node.next = start;
	            start = start.next;
	        }
	        else{
	            node.next = end;
	            end = end.next;
	        }
	        node = node.next;
	    }
		
		// Attach the remaining list to the new list (whichever is remaining)
	    if(start != null){
	        node.next = start;
	    }
	    if(end != null){
	        node.next = end;
	    }
		
		// Return the reference nodelist pointer
	    return noderef.next;
	}
}
