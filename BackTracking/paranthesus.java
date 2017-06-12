# Generate all paranthesus

public class Solution {
    ArrayList<String> list = new ArrayList<>();
	public ArrayList<String> generateParenthesis(int a) {
	    Paran(a,a,"");
	    return list;
	}
	public void Paran(int L, int R, String s){
	    if(L>R){
	        return;
	    }
	    if(L==0 && R==0){
	        list.add(s);
	        return;
	    }
	    if(L>0){
	        Paran(L-1,R,s+'(');
	    }
	    if(R>0){
	        Paran(L,R-1,s+')');
	    }
	}
}
