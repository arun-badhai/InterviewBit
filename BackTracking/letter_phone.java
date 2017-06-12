# Letter phone

public class Solution {
    ArrayList<String> list = new ArrayList<>();
    HashMap<Integer, String> map = new HashMap<>();
	public ArrayList<String> letterCombinations(String a) {
	    map.put(0, "0");
	    map.put(1, "1");
	    map.put(2, "abc");
	    map.put(3, "def");
	    map.put(4, "ghi");
	    map.put(5, "jkl");
	    map.put(6, "mno");
	    map.put(7, "pqrs");
	    map.put(8, "tuv");
	    map.put(9, "wxyz");
	    Combo(0,"",a);
	    return list;
	}
	public void Combo(int start, String s, String a){
	    if(start == a.length()){
	        list.add(s);
	        return;
	    }
        int c = Character.getNumericValue(a.charAt(start));
        String temp = map.get(c);
        for(int j=0;j<temp.length();j++){
            Combo(start+1, s+temp.charAt(j),a);
        }
	}
}
