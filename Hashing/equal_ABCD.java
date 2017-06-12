# Equal (A+B = C+D)

public class Solution {
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> temp;
    public ArrayList<Integer> equal(ArrayList<Integer> a) {
        for(int i=0;i<a.size();i++){
            for(int j=i+1;j<a.size();j++){
                int sum = a.get(i)+a.get(j);
                if(!map.containsKey(sum)){
                    temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    map.put(sum, temp);
                }
                else{
                    temp = map.get(sum);
                    int a1 = temp.get(0);
                    int a2 = temp.get(1);
                    if(a1 != i && a1 != j && a2 != i && a2 != j){
                        if(list.isEmpty()){
                            list.add(a1);
                            list.add(a2);
                            list.add(i);
                            list.add(j);
                        }
                        else{
                            if(a1 < list.get(0) || (a1 == list.get(0) && a2 < list.get(1)) ||
                            (a2 == list.get(1) && i < list.get(2)) || (i == list.get(2) && j < list.get(3))){
                                list.set(0,a1);
                                list.set(1,a2);
                                list.set(2,i);
                                list.set(3,j);
                            }
                        }
                        map.remove(sum);   
                    }
                }
            }
        }
        return list;
    }
}
