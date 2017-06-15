# Symmetric Binary Tree

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
	public int isSymmetric(TreeNode a) {
	    return Sys(a,a);
	}
	public int Sys(TreeNode a, TreeNode b){
	    if(a == null && b == null){
	        return 1;
	    }
	    if(a == null && b != null || a != null & b == null){
	        return 0;
	    }
	    if(a.val == b.val){
	        return Sys(a.left, b.right) & Sys(a.right, b.left);
	    }
	    return 0;
	}
}
