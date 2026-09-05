class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans= new int[2*nums.length]; // The answer array is twice the orginal array 
        int index=0; // starting empty position
        for (int i=0;i<2;i++){ // For loop for two times copying the numbers in orginal array
            for (int num:nums){
                ans[index++]=num;// Replace numbers in the answer array 
            }
        }
        return ans; // return answer array
    }
}