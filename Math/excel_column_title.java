# Excel Column Title

public class Solution {
	public String convertToTitle(int a) {
	    StringBuilder sb = new StringBuilder();
	    while(a!=0){
	        a--;
	        char c = (char)(a%26 + 'A');
	        sb.append(c);
	        a = a/26;
	    }
	    return sb.reverse().toString();
	}
}
