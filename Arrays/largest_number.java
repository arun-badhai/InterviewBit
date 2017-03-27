# Largest Number

public class Solution {
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> a) {
	    String[] array = new String[a.size()];
		
		// Stores the numbers as strings in string array
	    for(int i=0;i<a.size();i++){
	        array[i] = String.valueOf(a.get(i));
	    }
		
		// Sorts the string array
	    Arrays.sort(array, new Comparator<String>(){
	        public int compare(String a, String b){
	            return (b+a).compareTo(a+b);
	        }
	    });
		
		// Appends to the new string
	    StringBuilder sb = new StringBuilder();
	    for(String k: array){
	        sb.append(k);
	    }
		
		// Remove all the 0's appended at the start of the string
	    while(sb.length() > 1 && sb.charAt(0) == '0'){
	        sb.deleteCharAt(0);
	    }
	    return sb.toString();
	}
}
