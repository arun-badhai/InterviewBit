# Inorder Traversal of Cartesian Tree

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
    public TreeNode buildTree(ArrayList<Integer> a) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> y-x);
        for(int i=0;i<a.size();i++){
            pq.add(a.get(i));
        }
        return Build(0,a.size()-1,a,pq);
    }
    public TreeNode Build(int start, int end, ArrayList<Integer> a, PriorityQueue<Integer> pq){
        if(start>end){
            return null;
        }
        int index = Find(start, end, a);
        TreeNode root = new TreeNode(a.get(index));
        if(start == end){
            return root;
        }
        root.right = Build(index+1,end,a,pq);
        root.left = Build(start,index-1,a,pq);
        return root;
    }
    public int Find(int start, int end, ArrayList<Integer> a){
        int max = Integer.MIN_VALUE;
        int ind = start;
        for(int i=start;i<=end;i++){
            if(a.get(i) > max){
                max = a.get(i);
                ind = i;
            }
        }
        return ind;
    }
}
