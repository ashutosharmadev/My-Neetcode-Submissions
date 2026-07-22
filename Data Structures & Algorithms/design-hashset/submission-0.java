class MyHashSet {
    private List<Integer> data; // Declaring list
    public MyHashSet() {
        data=new ArrayList<>(); // Initialised array called data
    }
    
    public void add(int key) {
        if(!data.contains(key)){ // if data doesnt contain key then 
            data.add(key); // add key in array
        }
    }
    
    public void remove(int key) {
        data.remove(Integer.valueOf(key)); // removes the value not the key 
    }
    
    public boolean contains(int key) {
        return data.contains(key);// checks for key
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */