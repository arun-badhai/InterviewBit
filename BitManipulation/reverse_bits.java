# Reverse Bits

public class Solution {
	public long reverse(long a) {
	    ArrayList<Long> list = new ArrayList<>();
	    long num = 2;
		
		// Finds the reverse bits
	    while(a != 0){
	        long val = a%num;
	        list.add(val);
	        a = a/num;
	    }
	    long total = 0;
	    int p = 31;
		
		// Find the total value using (2^31+2^30+....2^0) formula
	    for(int i=0;i<list.size();i++){
	        long val1 = list.get(i);
	        long val2 = (long) Math.pow(2, p);
	        total = total + (val1*val2);
	        p--;
	    }
	    return total;
	}
}
