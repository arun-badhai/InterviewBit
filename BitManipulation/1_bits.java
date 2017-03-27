# Number of 1 bits

public class Solution {
	public int numSetBits(long a) {
	    int count = 0;
	    long num = 2;
		
		// Keep iterating till quotient is 0
	    while(a != 0){
	        long val = a%num;
			
			// Bit found is 1
	        if(val == 1){
	            count++;
	        }
	        a = a/num;
	    }
	    return count;
	}
}
