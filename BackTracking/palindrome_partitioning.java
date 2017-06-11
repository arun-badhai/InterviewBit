# Palindrome partitioning

public class Solution {
    ArrayList<ArrayList<String>> list = new ArrayList<>();
	public ArrayList<ArrayList<String>> partition(String a) {
	    Palindrome(0,new ArrayList(),a);
	    return list;
	}
	public void Palindrome(int start,ArrayList<String> temp,String a){
	    if(start==a.length()){
	        list.add(new ArrayList(temp));
	    }
	    for(int i=start;i<a.length();i++){
	        String s = a.substring(start,i+1);
	        if(PD(s) == true){
	           temp.add(s);
	           Palindrome(i+1,temp,a);
	           temp.remove(temp.size()-1);
	        }
	    }
	}
	public boolean PD(String s){
	   int L=0;
	   int R=s.length()-1;
	   while(L<R){
	       if(s.charAt(L) != s.charAt(R)){
	           return false;
	       }
	       L++;
	       R--;
	   }
	   return true;
	}
}
