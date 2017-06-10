# Combination sum

public class Solution {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    Set<ArrayList<Integer>> set = new HashSet<>();
	public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
	    Collections.sort(a);
	    Combo(0,b,new ArrayList<>(),a);
	    return list;
	}
	public void Combo(int start, int target, ArrayList<Integer> temp, ArrayList<Integer> a){
	    if(target == 0){
	        ArrayList<Integer> t = new ArrayList(temp);
	        if(!set.contains(t)){
	            list.add(t);
	            set.add(t);
	        }
	    }
	    if(target-a.get(start) < 0){
	        return;
	    }
	    for(int i=start;i<a.size();i++){
	        temp.add(a.get(i));
	        Combo(i, target-a.get(i), temp, a);
	        temp.remove(temp.size()-1);
	    }
	}
}
