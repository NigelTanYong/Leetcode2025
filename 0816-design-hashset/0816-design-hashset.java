class MyHashSet {
    boolean[] data; //space complexity o(n)
    public MyHashSet() {
        data = new boolean[1000001];
    }
    
    public void add(int key) { //time complexity: O(1)
        data[key] = true;
    }
    
    public void remove(int key) { //time complexity: O(1)
        data[key] = false;
    }
    
    public boolean contains(int key) { //time complexity: O(1)
        return data[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */