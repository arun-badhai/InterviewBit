# Difference2

public class Solution {
	public int diffPossible(final List<Integer> a, int b) {
	    if(a.size()< 2){
	        return 0;
	    }
	    Set<Integer> set = new HashSet<Integer>();
	    for(int i=0;i<a.size();i++){
	        if(a.get(i) < b){
	            if(set.contains(a.get(i))){
    	            return 1;
    	        }
    	        else{
    	            set.add(a.get(i));
    	        }
	        }
	        else{
	            int val = a.get(i) - b;
    	        if(set.contains(val)){
    	            return 1;
    	        }
    	        else{
    	            set.add(val);
    	        }
	        }
	    }
	    return 0;
	}
}
