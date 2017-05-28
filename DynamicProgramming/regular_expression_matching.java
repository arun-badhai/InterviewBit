# Regular expression matching

public class Solution {
	public int isMatch(final String s, final String p) {
	    int[][] array = new int[s.length()+1][p.length()+1];
	    for(int i=0;i<=s.length();i++){
	        array[i][0] = 0;
	    }
	    for(int i=0;i<=p.length();i++){
	        array[0][i] = 0;
	    }
	    array[0][0] = 1;
	    for(int i=1;i<=p.length();i++){
	        if(p.charAt(i-1) == '*'){
	            array[0][i] = array[0][i-2];
	        }
	    }
	    for(int i=1;i<=s.length();i++){
	        for(int j=1;j<=p.length();j++){
	            if((s.charAt(i-1) == p.charAt(j-1)) || (p.charAt(j-1) == '.')){
	                array[i][j] = array[i-1][j-1];
	            }
	            else if(p.charAt(j-1) == '*'){
	                array[i][j] = array[i][j-2];
	                if((s.charAt(i-1) == p.charAt(j-2)) || (p.charAt(j-2) == '.')){
	                    array[i][j] = array[i][j] | array[i-1][j];
	                }
	            }
	            else{
	                array[i][j] = 0;
	            }
	        }
	    }
	    return array[s.length()][p.length()];
	}
}
