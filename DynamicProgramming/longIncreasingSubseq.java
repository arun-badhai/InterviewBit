# Longest increasing subsequence

public class Solution {
	public int lis(final List<Integer> a) {
	    int[] array = new int[a.size()];
	    for(int i=0;i<a.size();i++){
	        array[i] = 1;
	    }
	    int max = 1;
	    for(int i=1;i<a.size();i++){
	        for(int j=0;j<i;j++){
	            if(a.get(i) > a.get(j)){
	                array[i] = Math.max(array[i],1+array[j]);
	            }
	        }
	        max = Math.max(array[i], max);
	    }
	    return max;
	}
}
