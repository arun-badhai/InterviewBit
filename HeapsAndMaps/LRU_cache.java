# LRU cache

class LRUMap<K,V> extends LinkedHashMap<K,V>{
    private final int MAX_NUM;
    
    public LRUMap(int capacity){
        super(capacity);
        MAX_NUM = capacity;
    }
    
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest){
        return size() > MAX_NUM;
    }
}

public class Solution {
    LRUMap<Integer, Integer> map;
    public Solution(int capacity) {
        map = new LRUMap<Integer, Integer>(capacity);
    }
    
    public int get(int key) {
        if(map == null || map.get(key) == null) return -1;
        int value = map.get(key);
        map.remove(key);
        map.put(key, value);
        return value;
    }
    
    public void set(int key, int value) {
        if(map == null) return;
        get(key);
        map.put(key, value);
    }
}
