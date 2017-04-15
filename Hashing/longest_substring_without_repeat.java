# Longest substring without repeat

public class Solution {
	public int lengthOfLongestSubstring(String a) {
	    int i=0;
	    int max = Integer.MIN_VALUE;
		
		// Iterate till the end of the string
	    while(i<a.length()){
	        int j=i;
	        int val = 0;
	        Set<Character> set = new HashSet<Character>();
			
			// If character is not present in the set, add it and increment max value
	        while(j<a.length() && !set.contains(a.charAt(j))){
	            set.add(a.charAt(j));
	            val++;
	            j++;
	        }
			
			// Compare current and previous max value
	        if(val > max){
	            max = val;
	        }
	        i++;
	    }
	    return max;
	}
}
