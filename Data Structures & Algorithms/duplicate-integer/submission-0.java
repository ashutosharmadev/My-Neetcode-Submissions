class Solution {
    public boolean hasDuplicate(int[] nums) {
     Set<Integer>intSet= new HashSet<>(); // Initialised Hashset
     for (int num:nums){ // For loop traversing the entire nums array
        if(intSet.contains(num)){ // Check if element is in the HashSet
            return true; // if the num already exists in the Hashmap it will return true
        }
        intSet.add(num); // If not the adds num
     }
        return false;
    }
}