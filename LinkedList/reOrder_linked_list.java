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
	    if(a == null){
	        return null;
	    }
	    if(a.next == null){
	        return a;
	    }
	    ListNode tort = a;
	    ListNode hare = tort.next;
	    while(hare != null || hare.next != null){
	        tort = tort.next;
	        hare = hare.next.next;
	    }
	    ListNode list1 = a;
	    ListNode list2 = tort.next;
	    tort.next = null;
	    list2 = reverse(list2); 
	    ListNode val = new ListNode(0);
	    ListNode temp = val;
	    while(list1 != null || list2 != null){
	        if(list1 != null){
	            temp.next = list1;
	            temp = temp.next;
	            list1 = list1.next;
	        }
	        if(list2 != null){
	            temp.next = list2;
	            temp = temp.next;
	            list2 = list2.next;
	        }
	    }
	    return val.next;
	}
}
