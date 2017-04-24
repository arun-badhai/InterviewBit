# Merge overlapping intervals

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> arrayL = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(intervals.size() == 0){
            return arrayL;
        }
        if(intervals.size() == 1){
            arrayL.add(intervals.get(0));
            return arrayL;
        }
        for(int i=0;i<intervals.size();i++){
            Interval intr = intervals.get(i);
            int start = intr.start;
            int end = intr.end;
            if(list.isEmpty()){
                ArrayList<Integer> set = new ArrayList<>();
                set.add(start);
                set.add(end);
                list.add(set);
            }
            else{
                int j = 0;
                while(j<list.size()){
                    ArrayList<Integer> temp = list.get(j);
                    int a = temp.get(0);
                    int b = temp.get(1);
                    if(start <= a || start <= b){
                        ArrayList<Integer> arr = new ArrayList<>();
                        arr.add(start);
                        arr.add(end);
                        arr.add(a);
                        arr.add(b);
                        int min = Collections.min(arr);
                        int max = Collections.max(arr);
                        list.remove(j);
                        ArrayList<Integer> arr1 = new ArrayList<>();
                        arr1.add(min);
                        arr1.add(max);
                        list.add(arr1);
                        break;
                    }
                    j++;
                }
                if(j == list.size()){
                    ArrayList<Integer> set1 = new ArrayList<>();
                    set1.add(start);
                    set1.add(end);
                    list.add(set1);
                }
            }
        }
        for(int i=0;i<list.size();i++){
            ArrayList<Integer> arr = list.get(i);
            Interval intr = new Interval(arr.get(0), arr.get(1));
            arrayL.add(intr);
        }
        return arrayL;
    }
}
