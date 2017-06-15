# Path sum

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
	public int hasPathSum(TreeNode a, int b) {
	    return Sum(a, b);
	}
	public int Sum(TreeNode a, int value){
	    if(a == null){
	        return 0;
	    }
	    if(a.val == value && (a.left == null && a.right == null)){
	        return 1;
	    }
	    return Sum(a.left, value-a.val) | Sum(a.right, value-a.val);
	}
}
