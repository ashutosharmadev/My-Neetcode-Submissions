class Solution {
    public void sortColors(int[] nums) {
        int i=0, l=0, r=nums.length-1; // Initialise three pointer for quicksort
        while(i<=r){ // Until i pointer has crossed pointer r sorting is not completed
            if(nums[i]==0){ // Place 0 at the front of the array
                swap(nums,l,i); // l pehle aayega i se
                l++; // Left pointer will keep incrementing
            } else if(nums[i]==2){ // Place 2 at the end of the array
                swap(nums,i,r); // i pehle hai r se
                r--; // Right pointer will keep decrementing
                i--; // so that index doesnt go out of bounds
            }
            i++; // keep incrementing ith index
        }
    }
    private void swap(int[]nums, int i, int j){
        int temp=nums[i]; // Save value of ith element temporarily 
        nums[i]=nums[j]; // Copy value of jth element into ith element
        nums[j]=temp; // Place value of ith index into jth index
    }
}