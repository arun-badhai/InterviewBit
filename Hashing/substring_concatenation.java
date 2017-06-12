# Substring Concatenation

//Method 1
public class Solution {
    ArrayList<Integer> list = new ArrayList<Integer>();
    HashSet<String> set = new HashSet<>();
	public ArrayList<Integer> findSubstring(String a, List<String> temp) {
	    Permute(0, temp);
	    int count = temp.size();
	    int len = temp.get(0).length();
	    int num = count*len;
	    for(int i=0;i<=a.length()-num;i++){
	        String s = a.substring(i,i+num);
	        if(set.contains(s)){
	            list.add(i);
	        }
	    }
	    return list;
	}
	public void Permute(int start, List<String> temp){
	    if(start==temp.size()){
	        StringBuilder sb = new StringBuilder();
	        for(int i=0;i<temp.size();i++){
	            sb.append(temp.get(i));
	        }
	        set.add(sb.toString());
	    }
	    for(int i=start;i<temp.size();i++){
	        Swap(i,start,temp);
	        Permute(i+1, temp);
	        Swap(i,start,temp);
	    }
	}
	public void Swap(int x, int y, List<String> temp){
	    String t = temp.get(x);
	    temp.set(y, temp.get(x));
	    temp.set(x, t);
	}

}

// Method 2 : Using hashmaps when, list is final

public class Solution {
    ArrayList<Integer> list = new ArrayList<Integer>();
    HashMap<String, Integer> map = new HashMap<>();
    HashMap<String, Integer>ref;
    int n;
	public ArrayList<Integer> findSubstring(String a, final List<String> b) {
	    for(int i=0;i<b.size();i++){
	        if(!map.containsKey(b.get(i))){
	            map.put(b.get(i), 1);
	        }
	        else{
	            n = map.get(b.get(i));
	            map.put(b.get(i), n+1);
	        }
	    }
	    int count = b.size();
	    int len = b.get(0).length();
	    int num = count*len;
	    for(int i=0;i<=a.length()-num;i++){
	        String s = a.substring(i,i+num);
	        ref=(HashMap)map.clone();
	        for(int j=0;j<s.length();j=j+len){
	            String s1 = s.substring(j,j+len);
	            if(ref.containsKey(s1)){
	               n = ref.get(s1);
	               if(n==1){
	                   ref.remove(s1);
	               }
	               else{
	                   ref.put(s1, n-1);
	               }
	            }
	        }
	        if(ref.size() == 0){
	            list.add(i);
	        }
	    }
	    return list;
	}
}
