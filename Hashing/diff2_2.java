# Difference2 (HashMaps)

public class Solution {
	public int diffPossible(final List<Integer> a, int b) {
	    if(a.size()< 2){
	        return 0;
	    }
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for(int i=0;i<a.size();i++){
	        if(map.containsKey(a.get(i))){
	            int v = map.get(a.get(i));
	            map.put(a.get(i), v+1);
	        }
	        else{
	            map.put(a.get(i), 1);
	        }
	    }
	    for(int i=0;i<a.size();i++){
	        int v1 = a.get(i) - b;
	        int v2 = b - a.get(i);
	        if(map.containsKey(v1)){
	            if(v1 == a.get(i) && map.get(v1) > 1){
	                return 1;
	            }
	            else if(v1 != a.get(i)){
	                return 1;
	            }
	        }
	        if(map.containsKey(v2)){
	            if(v2 == a.get(i) && map.get(v2) > 1){
	                return 1;
	            }
	            else if(v2 != a.get(i)){
	                return 1;
	            }
	        }
	    }
	    return 0;
	}
}
