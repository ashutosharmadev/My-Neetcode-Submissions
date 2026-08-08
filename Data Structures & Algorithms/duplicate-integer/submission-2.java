class Solution {
    public boolean hasDuplicate(int[] nums) {
     Set<Integer>set= new HashSet<>(); // Initialised Hashset
     for (int num:nums){ // For loop traversing the entire nums array
        if(set.contains(num)){ // Check if element is in the HashSet
            return true; // if the num already exists in the Hashmap it will return true.
        }
        set.add(num); // If not the adds num
     }
        return false;
    }
}