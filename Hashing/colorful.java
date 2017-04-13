# Colorful number

public class Solution {
	public int colorful(int a) {
	    StringBuilder sb = new StringBuilder();
		
		// Append number to a string
	    while(a != 0){
	        sb.append(a%10);
	        a = a/10;
	    }
	    String s = sb.reverse().toString();
		
		// String length is 0
	    if(s.length() == 0){
	        return 0;
	    }
		
		// String length is 1
	    if(s.length() == 1){
	        return 1;
	    }
	    int l = s.length();
	    int[][] ans = new int[l][l];
	    Set<Integer> set = new HashSet<>();
		
		// Store all diagonal elements
	    for(int i=0;i<l;i++){
	        ans[i][i] = Character.getNumericValue(s.charAt(i));
			
			// If present in the set, return false
	        if(set.contains(ans[i][i])){
	            return 0;
	        }
	        set.add(ans[i][i]);
	    }
		
		// Iterate for every length
	    for(int i=2;i<=l;i++){
		
			// Start pointer
	        for(int j=0;j<l-i+1;j++){
			
				// End pointer
	            int k=j+i-1;
	            int val = 0;
				
				// Use previous value to update current
	            if(i==2){
	                val = Character.getNumericValue(s.charAt(j)) * Character.getNumericValue(s.charAt(k));
	            }
	            else{
	                val = ans[j+1][k-1] * Character.getNumericValue(s.charAt(j)) * Character.getNumericValue(s.charAt(k));
	            }
				
				// Set array values
	            ans[j][k] = val;
				
				// If present in the set, return false
	            if(set.contains(ans[j][k])){
	                return 0;
	            }
	            set.add(ans[j][k]);
	        }
	    }
		
		// Unique values
	    return 1;
	}
}
