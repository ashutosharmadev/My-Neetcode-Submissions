class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>nums_map= new HashMap<>(); // Initialise new Hashmap
        for (int i=0; i<nums.length;i++){ // Traverse through nums array
            int complement= target-nums[i]; // In order to find the complement= target-current number
            if(nums_map.containsKey(complement)){ // If hashmap contains complement
                return new int[] {nums_map.get(complement),i}; // then it returns a new array from the complement found in hashmap
            }
            nums_map.put(nums[i],i); // As nums array is traversed, each number is placed in the hashmap
        }
        throw new IllegalArgumentException("No match is found"); // in the event no complement is found for the target then
    }
}
