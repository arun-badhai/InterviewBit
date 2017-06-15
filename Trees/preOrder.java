#Pre-Order

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
    ArrayList<Integer> list = new ArrayList<>();
	public ArrayList<Integer> preorderTraversal(TreeNode a) {
	    Traverse(a);
	    return list;
	}
	public void Traverse(TreeNode a){
	    if(a != null){
	        list.add(a.val);
	        Traverse(a.left);
	        Traverse(a.right);
	    }
	}
}
