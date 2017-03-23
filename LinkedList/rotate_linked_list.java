# Rotate a linked list to the right by b places

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode rotateRight(ListNode a, int b) {
	    ListNode start = a;
	    int count = 0;
		
		// Count the number of nodes in the linked list
	    while(a.next != null){
	        a = a.next;
	        count++;
	    }
	    count++;
	    b = b%count;
		
		// Full rotation, so the nodes will be at the same place
		if (b == 0){
    	    return start;
    	}
		
		// Number of nodes present at the end
	    b = count - b;
		
		// Point last node to the first node
    	a.next = start;	
		
		// Iterate, to find the start value
    	while (b > 0) {
    		a = a.next;
    		b--;
    	}
		
		// Set the start pointer
    	start = a.next;
		
		// Update end node's value
    	a.next = null;
		
		// Return start pointer
    	return start;
	}
}
