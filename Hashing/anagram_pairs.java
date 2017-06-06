# Anagram Pairs

public class Solution {
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
	    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
	    HashMap<String, ArrayList<Integer>> map = new HashMap<>();
	    for(int i=0;i<a.size();i++){
	        char[] ar = a.get(i).toCharArray();
            Arrays.sort(ar);
            String sorted = String.valueOf(ar);
            if(!map.containsKey(sorted)){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i+1);
                map.put(sorted, list);
            }
            else{
                ArrayList<Integer> list = map.get(sorted);
                list.add(i+1);
                map.put(sorted, list);
            }
	    }
	    for(String s : map.keySet()){
	        ans.add(map.get(s));
	    }
	    return ans;
	}
}
