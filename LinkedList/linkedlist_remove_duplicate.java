# Remove duplicate from sorted linked list

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode a) {
	
		// Given node or next node is null
	    if(a==null || a.next == null){
	        return a;
	    }
		
		// Reference to the start node
	    ListNode start = a;
		
		// Iterate till the node or its next node is not null
	    while(start != null && start.next != null){
		
			// Move head if the values are not same
	        if(start.next.val != start.val){
	            start = start.next;
	        }
			
			// Delete duplicate nodes
	        else{
	            start.next = start.next.next;
	        }
	    }
	    return a;
	}
}
