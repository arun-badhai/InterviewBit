# Construct binary tree from inorder and postorder

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
	public TreeNode buildTree(ArrayList<Integer> inorder, ArrayList<Integer> postorder) {
	    Stack<Integer> st = new Stack<Integer>();
	    for(int i=0;i<postorder.size();i++){
	        st.push(postorder.get(i));
	    }
	    return Build(inorder, 0, inorder.size()-1,st);
	}
	public TreeNode Build(ArrayList<Integer> inorder, int start, int end, Stack<Integer> st){
	    if(start>end){
	        return null;
	    }
	    int x = st.pop();
	    TreeNode root = new TreeNode(x);
	    if(start == end){
	        return root;
	    }
	    int index = Find(inorder, x, start, end);
	    root.right = Build(inorder, index+1, end, st);
	    root.left = Build(inorder, start, index-1, st);
	    return root;
	}
	public int Find(ArrayList<Integer> inorder, int x, int start, int end){
	    int i;
        for (i = start; i <= end; i++) 
        {
            if (inorder.get(i) == x)
                break;
        }
        return i;
	}
}
