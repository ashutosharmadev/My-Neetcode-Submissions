class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last=m+n-1; // Last index of merged sorted array
        int i=m-1, j=n-1; // last index of nums1 and nums2 
    
        while(j>=0){ // As long as j pointer is greater than 0
            if(i>=0 && nums1[i]>nums2[j]){ // if nums1 is greater than nums2
                nums1[last--]=nums1[i--]; // add nums1 to the end of array
            } else{
                nums1[last--]=nums2[j--]; // otherwise add nums2 to the end of the array
            }
        }
    }
}