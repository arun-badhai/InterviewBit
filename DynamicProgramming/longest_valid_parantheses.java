# Longest valid Parantheses

public class Solution {
	public int longestValidParentheses(String a) {
	    Stack<Integer> st = new Stack<>();
	    st.push(-1);
	    int i=0;
	    int max=0;
	    while(i<a.length()){
	        if(a.charAt(i) == '('){
	            st.push(i);
	        }
	        else{
	            st.pop();
	            if(st.isEmpty()){
	                st.push(i);
	            }
	            else{
	                max = Math.max(max, i-st.peek());
	            }
	        }
	        i++;
	    }
	    return max;
	}
}
