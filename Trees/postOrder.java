# Post-Order

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
    ArrayList<Integer> list = new ArrayList<Integer>();
	public ArrayList<Integer> postorderTraversal(TreeNode a) {
	    Traverse(a);
	    return list;
	}
	public void Traverse(TreeNode a){
	    if(a != null){
	        Traverse(a.left);
	        Traverse(a.right);
	        list.add(a.val);
	    }
	}
}
