# Sum root to leaf (MOD)

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
    private static final int MOD = 1003;
	public int sumNumbers(TreeNode a) {
	    return Sum(a,0)%MOD;
	}
	public int Sum(TreeNode root, int sum){
        if(root == null){
            return 0;
        }
        sum = (sum*10 + root.val)%MOD;
        if(root.left == null && root.right == null){
            return sum;   
        }
        return (Sum(root.left, sum) + Sum(root.right, sum))%MOD;
	}
}
