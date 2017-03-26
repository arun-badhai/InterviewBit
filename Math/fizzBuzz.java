# FizzBuzz

public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> list = new ArrayList<>();
        if(A == 0){
            return list;
        }
        for(int i=1; i<=A; i++){
            if(i%3 == 0 && i%5 == 0){
                list.add("FizzBuzz");
            }
            else if(i%3 == 0){
                list.add("Fizz");
            }
            else if(i%5 == 0){
                list.add("Buzz");
            }
            else{
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
