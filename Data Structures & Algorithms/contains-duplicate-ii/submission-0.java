class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        // Stores: (number -> its most recent index)
        Map<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // If the current number has been seen before
            // and the distance between the current index and
            // its previous index is at most k, we found a valid duplicate.
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }

            // Update the number's most recent index
            // (or insert it if it's the first occurrence)
            map.put(nums[i], i);
        }

        // No nearby duplicate found
        return false;
    }
}