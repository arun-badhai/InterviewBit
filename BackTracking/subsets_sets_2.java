# Subset 2

public class Solution {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    HashSet<ArrayList<Integer>> set = new HashSet<>();
	public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> a) {
	    Collections.sort(a);
	    Subset(0,new ArrayList(),a);
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
