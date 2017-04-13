# Anagrams

public class Solution {
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
	    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
	    if(a.size() < 2){
	        return ans;
	    }
	    HashMap<String, Integer> map = new HashMap<>();
	    for(int i=0;i<a.size();i++){
	        String s1 = a.get(i);
            char[] ar = s1.toCharArray();
            Arrays.sort(ar);
            String sf1 = String.valueOf(ar);
	        if(map.containsKey(sf1)){
	            ArrayList<Integer> list =new ArrayList<>();
	            list.add(map.get(sf1));
	            list.add(i+1);
	            ans.add(list);
	        }
	        else{
	            map.put(sf1, i+1);
	            list.add(i+1);
	        }
	    }
	    return ans;
	}
}
