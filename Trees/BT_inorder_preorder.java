# Binary Tree From Inorder And Preorder

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
	public TreeNode buildTree(ArrayList<Integer> preorder, ArrayList<Integer> inorder) {
	    Stack<Integer> st = new Stack<Integer>();
	    for(int i=preorder.size()-1;i>=0;i--){
	        st.push(preorder.get(i));
	    }
	    return Build(0, inorder.size()-1, inorder, st);
	}
	public TreeNode Build(int start, int end, ArrayList<Integer> inorder, Stack<Integer> st){
	    if(start>end){
	        return null;
	    }
	    int x = st.pop();
	    TreeNode root = new TreeNode(x);
	    if(start == end){
	        return root;
	    }
	    int index = Find(start, end, x, inorder);
	    root.left = Build(start, index-1, inorder, st);
	    root.right = Build(index+1, end, inorder, st);
	    return root;
	}
	public int Find(int start, int end, int x, ArrayList<Integer> inorder){
	    int i;
	    for(i=start;i<=end;i++){
	        if(inorder.get(i) == x){
	            break;
	        }
	    }
	    return i;
	}
}
