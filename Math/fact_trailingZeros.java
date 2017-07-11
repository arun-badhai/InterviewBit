# Trailing 0's in factorial

public class Solution {
  
	public int trailingZeroes(int a) {
	    int count = 0;
	     while(a != 0){
	         count = count + a/5;
	         a = a/5;
	     }
	    return count;
	}
}
