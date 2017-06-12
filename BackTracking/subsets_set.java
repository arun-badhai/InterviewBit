# Subsets of a set

public class Solution {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    HashSet<ArrayList<Integer>> set = new HashSet<>();
	public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
	    Set<Integer> s = new HashSet<>(a);
	    ArrayList<Integer> sorted = new ArrayList<Integer>(s);
	    Collections.sort(sorted);
	    Subset(0,new ArrayList(),sorted);
	    return list;
	}
	public void Subset(int start,ArrayList<Integer> temp,ArrayList<Integer> a){
	    if(start <= a.size()){
	        ArrayList<Integer> t = new ArrayList(temp);
	        if(!set.contains(t)){
	            list.add(t);
	            set.add(t);   
	        }
	    }
	    for(int i=start;i<a.size();i++){
	        temp.add(a.get(i));
	        Subset(i+1,temp,a);
	        temp.remove(temp.size()-1);
	    }
	}
}
