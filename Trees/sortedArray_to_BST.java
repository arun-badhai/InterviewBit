# Sorted array to BST

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public TreeNode sortedArrayToBST(final List<Integer> a) {
	    return Sorted(0, a.size()-1, a);
	}
	public TreeNode Sorted(int L, int R, final List<Integer> a){
	    if(L>R){
	        return null;
	    }
	    int mid = (L+R)/2;
	    TreeNode root = new TreeNode(a.get(mid));
	    root.left = Sorted(L, mid-1, a);
	    root.right = Sorted(mid+1, R, a);
	    return root;
	}
}
