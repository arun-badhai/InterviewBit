# Sum 2-HashMaps

public class Solution {
	public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
	    ArrayList<Integer> list = new ArrayList<>();
	    if(a.size() < 2){
	        return list;
	    }
	    HashMap<Integer, Integer> map =  new HashMap<>();
	    for(int i=0;i<a.size();i++){
	        if(map.containsKey(a.get(i))) {
                list.add(map.get(a.get(i)) + 1);
                list.add(i+1);
                break;
            } else {
                if(!map.containsKey(b-a.get(i))){
                    map.put(b-a.get(i), i);
                }
            }
	    }
        return list;
	}
}
