# Gray code

public class Solution {
    ArrayList<Integer> list = new ArrayList<>();
	public ArrayList<Integer> grayCode(int a) {
	    list.add(0);
	    for(int i=0;i<a;i++){
	        int size = list.size();
	        for(int j=size-1;j>=0;j--){
	            list.add(list.get(j)+size);
	        }
	    }
	    return list;
	}
}
