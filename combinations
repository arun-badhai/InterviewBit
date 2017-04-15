# Combinations

public class Solution {
	public ArrayList<ArrayList<Integer>> combine(int n, int k) {
	    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	    int[] array = new int[n];
	    for(int i=0;i<n;i++){
	        array[i] = i+1;
	    }
	    if(k>n){
	        return list;
	    }
	    if(k==n){
	        ArrayList<Integer> temp = new ArrayList<>();
	        for(int i=0;i<n;i++){
	            temp.add(array[i]);
	        }
	        list.add(temp);
	        return list;
	    }
	    for(int i=0;i<=n-k;i++){
	        for(int j=i+1;j<i+k;j++){
	           ArrayList<Integer> temp = new ArrayList<>();
	           temp.add(array[i]);
	           for(int m=j;m<j+k-1;m++){
	               temp.add(array[m]);
	           }
	           list.add(temp);
	        }
	    }
	    return list;
	}
}
