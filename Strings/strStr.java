# Implement StrStr

public class Solution {
	public int strStr(final String haystack, final String needle) {
	    if(haystack.length() == 0 && needle.length() == 0 || needle.length() == 0){
	        return -1;
	    }
	    int l1 = haystack.length();
	    int l2 = needle.length();
	    for(int i=0;i<=l1-l2;i++){
	        String sub = haystack.substring(i,i+l2);
	        if(sub.equals(needle)){
	            return i;
	        }
	    }
	    return -1;
	}
}
