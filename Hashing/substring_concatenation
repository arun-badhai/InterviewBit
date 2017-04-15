# Substring concatenation

public class Solution {
	public ArrayList<Integer> findSubstring(String a, final List<String> b) {
	    int l1 = a.length();
	    int l2 = b.get(0).length();
	    int size = b.size();
	    ArrayList<Integer> list = new ArrayList<>();
	    if(l1 == 0 || l2 == 0 || size == 0){
	        return list;
	    }
	    if(l1 < l2*size){
	        return list;
	    }
	    HashMap<String, Integer> map = new HashMap<>();
	    for(int k=0;k<size;k++){
	    	if(map.containsKey(b.get(k))){
	    		int v = map.get(b.get(k));
	    		map.put(b.get(k), v+1);
	    	}
	    	else{
	    		map.put(b.get(k), 1);	
	    	}
	    }
	    HashMap<String, Integer> maptemp = new HashMap<>(map);
	    int i=0;
	    while(i <= l1-(l2*size)){
	        int j=i;
	        String temp = a.substring(j,j+l2);
	        while(j <= l1-(l2*size) && map.containsKey(temp)){
	        	//System.out.println(temp);
	        	//System.out.println(temp+"  "+map.get(temp));
	        	if(map.get(temp) == 0){
	        		break;
	        	}
	        	int v = map.get(temp);
	        	map.put(temp, v-1);
				j = j+l2;
				temp = a.substring(j, j+l2);
	        }
	        //System.out.println(map.keySet()+"   "+map.values());
	        int t = 0;
	        for(String key : map.keySet()){
	        	if(map.get(key) == 0){
	        		t++;
	        	}
	        }
	        if(t == size){
	        	list.add(i);
	        	i = i+l2*size;
	        }
	        else{
	        	i++;
	        }
	        map = maptemp;
	        //System.out.println(maptemp.values());
	        
	    }
	    return list;
	}
}
