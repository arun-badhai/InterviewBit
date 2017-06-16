# Max Depth

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
	public int maxDepth(TreeNode a) {
	    if(a == null){
	        return 0;
	    }
	    if(a.left == null && a.right == null){
	        return 1;
	    }
	    if(a.left == null){
	        return 1+maxDepth(a.right);
	    }
	    if(a.right == null){
	        return 1+maxDepth(a.left);
	    }
	    return Math.max(maxDepth(a.left), maxDepth(a.right))+1;
	}
}
