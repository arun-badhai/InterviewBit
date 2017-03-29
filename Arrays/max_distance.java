public class Solution {
	// DO NOT MODIFY THE LIST
	public int maximumGap(final List<Integer> a) {
	    int max;
	    int n = a.size();
	    
	    int[] L = new int[n];
	    int[] R = new int[n];
	 
	    L[0] = a.get(0);
	    for (int i = 1; i < n; ++i)
	        L[i] = Math.min(a.get(i), L[i-1]);

	    R[n-1] = a.get(n-1);
	    for (int j = n-2; j >= 0; j--)
	        R[j] = Math.max(a.get(j), R[j+1]);

	    int p = 0;
	    int q = 0;
	    max = -1;
	    while (p < n && q < n)
	    {
	        if (L[p] < R[q])
	        {
	            max = Math.max(max, p-q);
	            p = p + 1;
	        }
	        else
	            q = q+1;
	    }
	 
	    return max;
	}
}
