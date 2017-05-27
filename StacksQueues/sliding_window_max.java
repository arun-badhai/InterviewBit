# Sliding window maximum

// Using a deque
public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> slidingMaximum(final List<Integer> a, int b) {
	    ArrayList<Integer> list = new ArrayList<>();
	    Deque<Integer> q = new LinkedList<>();
	    for(int i=0;i<a.size();i++){
	        while(!q.isEmpty() && a.get(i) > a.get(q.getLast())){
	            q.removeLast();
	        }
	        q.addLast(i);
	        if(i-q.getFirst()+1 > b){
	            q.removeFirst();
	        }
	        if(i+1>=b){
	            list.add(a.get(q.getFirst()));
	        }
	    }
	    return list;
	}
}

// Using a priority queue
public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> slidingMaximum(final List<Integer> a, int b) {
	    ArrayList<Integer> list = new ArrayList<>();
	    PriorityQueue<Integer> q = new PriorityQueue<Integer>(3, Collections.reverseOrder());
	    for(int i=0;i<a.size();i++){
	        if(i>=b){
	            q.remove(a.get(i-b));
	        }
	        q.offer(a.get(i));
	        if(i+1>=b){
	            list.add(q.peek());
	        }
	    }
	    return list;
	}
}
