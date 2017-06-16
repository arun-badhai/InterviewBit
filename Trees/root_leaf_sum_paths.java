# Root to leaf sum paths

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
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
	    Sum(root, sum, new ArrayList());
	    return list;
	}
	public void Sum(TreeNode root, int x, ArrayList<Integer> temp){
	    if(root == null){
	        return;
	    }
	    if(root.val == x && (root.left == null && root.right == null)){
	        temp.add(root.val);
	        list.add(new ArrayList(temp));
	        return;
	    }
	    temp.add(root.val);
	    if(root.left != null){
	        Sum(root.left, x-root.val, temp);
	        temp.remove(temp.size()-1);
	    }
	    if(root.right != null){
	        Sum(root.right, x-root.val, temp);
	        temp.remove(temp.size()-1);
	    }
	    return;
	}
}
