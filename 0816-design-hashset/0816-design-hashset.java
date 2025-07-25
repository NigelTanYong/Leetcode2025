class MyHashSet {
    HashSet<Integer> set; //space complexity o(n)
    public MyHashSet() {
        set = new HashSet<>();
    }
    
    public void add(int key) { //time complexity: O(1)
        set.add(key);
    }
    
    public void remove(int key) { //time complexity: O(1)
        set.remove(key);
    }
    
    public boolean contains(int key) { //time complexity: O(1)
        return set.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */