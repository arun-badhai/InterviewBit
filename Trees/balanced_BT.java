# Balanced binary tree

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
	public int isBalanced(TreeNode a) {
	    if(a==null){
	        return 1;
	    }
	    int L = Height(a.left);
	    int R = Height(a.right);
	    if(Math.abs(L-R) <= 1 && isBalanced(a.left)==1 && isBalanced(a.right)==1){
	        return 1;
	    }
	    return 0;
	}
	public int Height(TreeNode a){
	    if(a==null){
	        return 0;
	    }
	    return 1+Math.max(Height(a.left), Height(a.right));
	}
}
