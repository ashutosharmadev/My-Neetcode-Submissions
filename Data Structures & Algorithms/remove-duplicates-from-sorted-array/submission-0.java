class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){ // if array length is 0 then you cant return any value
            return 0;
        }
        int k=1; // index where next unique element where will be placed
        for(int i=1;i<nums.length;i++){ // traversing the nums array
            if(nums[i]!=nums[i-1]){ // if current element is not a duplicate 
                nums[k]=nums[i]; // add element into nums k
                k++; // increment k for next unique element 
            }
        }
        return k;
    }
}