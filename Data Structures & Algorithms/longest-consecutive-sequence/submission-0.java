class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set= new HashSet<>(); // Initialise hashset
        for(int num:nums){ // Traverse through each element in the nums array
            set.add(num); // Add them to the set
        }
        int longest=0; // Initiate point longest at 0
        for(int num: nums){ // traverse the array
            if(!set.contains(num-1)){ // If there is no previous consecutive number, this is the start of a new sequence
                int length= 1; // The sequence currently contains only the starting number, so its length is 1.
                while(set.contains(num+length)){
                    length++; // we keep incrementing until while loop fails 
                }
                longest=Math.max(longest,length);// Give maximum value
            }
        }
        return longest; 
    }
}
