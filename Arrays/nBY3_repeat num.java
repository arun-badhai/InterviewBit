# N/3 repeat number

public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    int x = -1;
	    int y = -1;
	    int c1 = 0;
	    int c2 = 0;
	    for(int i=0;i<a.size();i++){
	        if(x != -1 && x == a.get(i)){
	            c1++;
	        }
	        else if(y != -1 && y == a.get(i)){
	            c2++;
	        }
	        else if(c1 == 0){
	            c1++;
	            x = a.get(i);
	        }
	        else if(c2 == 0){
	            c2++;
	            y = a.get(i);
	        }
	        else{
	            c1--;
	            c2--;
	        }
	    }
	    c1 = 0;
	    c2 = 0;
	    for(int i=0;i<a.size(); i++){
	        if(x == a.get(i)){
	            c1++;
	        }
	        else if(y == a.get(i)){
	            c2++;
	        }
	    }
	    if(c1 > a.size()/3){
	        return x;
	    }
	    else if(c2 > a.size()/3){
	        return y;
	    }
	    else{
	        return -1;
	    }
	}
}
