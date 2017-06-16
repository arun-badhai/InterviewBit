# kth smallest element in BST

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
    public int kthsmallest(TreeNode root, int k) {
        inorder(root);
        return list.get(k-1);
    }
    public void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
    }
}
