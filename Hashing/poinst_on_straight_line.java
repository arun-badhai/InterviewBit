# Points on straight line

public class Solution {
    HashMap<ArrayList<Integer>, Integer> map;
    ArrayList<Integer> list;
	public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
	    int finalMax = 0;
	    for(int i=0;i<a.size();i++){
	        int overlap = 0;
	        int max = 0;
	        int vertlap = 0;
	        map = new HashMap<>();
	        for(int j=i+1;j<a.size();j++){
	            if(a.get(i) == a.get(j) && b.get(i) == b.get(j)){
	                overlap++;
	            }
	            else if(a.get(i) == a.get(j)){
	                vertlap++;
	            }
	            else{
	                int num = b.get(j) - b.get(i);
	                int den = a.get(j) - a.get(i);
	                int g = findGCD(num,den);
	                num = num/g;
	                den = den/g;
	                list = new ArrayList<>();
	                list.add(num);
	                list.add(den);
	                if(!map.containsKey(list)){
	                    map.put(list, 1);
	                }
	                else{
	                    int val = map.get(list);
	                    map.put(list, val+1);
	                }
	                max = Math.max(max, map.get(list));
	            }
	            max = Math.max(max, vertlap);
	        }
	        finalMax = Math.max(finalMax, max+overlap+1);
	    }
	    return finalMax;
	}
	public int findGCD(int number1, int number2) 
	{ 
	    if(number2 == 0)
	    { 
	        return number1; 
	        
	    } 
	    return findGCD(number2, number1%number2); 
	}
}
