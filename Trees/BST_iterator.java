# BST Iterator

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    Stack<TreeNode> st = new Stack<>();
    public Solution(TreeNode root) {
        while(root != null){
            st.push(root);
            root = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(!st.isEmpty()){
            return true;
        }
        return false;
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = st.pop();
        int value = node.val;
        if(node.right != null){
            node = node.right;
            while(node != null){
                st.push(node);
                node = node.left;
            }
        }
        return value;
    }
}

/**
 * Your Solution will be called like this:
 * Solution i = new Solution(root);
 * while (i.hasNext()) System.out.print(i.next());
 */
