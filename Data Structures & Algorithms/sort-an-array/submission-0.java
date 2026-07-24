class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1); //Sort the entire array
        return nums; // Return the sorted array
    }
    private void mergeSort(int[] arr, int l,int r){ // Custom class of Mergesort
        if(l>=r) return; // Base case element is already sorted so just return as it is
        int m=(l+r)/2; // Determing middle index
        mergeSort(arr,l,m); // Sort the left part of array
        mergeSort(arr,m+1,r); // Sort the right part of the array
        merge(arr,l,m,r); // Merge the two sorted array
    }
    private void merge(int[] arr, int l, int m, int r){ // Custom class of Merge
        ArrayList<Integer>temp=new ArrayList<>(); // Temp array initialised
        int i=l; // i pointer is basically left pointer
        int j=m+1; // j pointer is basically right pointer 

        while(i<=m && j<=r){ // Comparing both pointer values and taking the smallest value
            if(arr[i]<=arr[j]){ // Left element is smaller
                temp.add(arr[i]); // Add it 
                i++; // Shift the pointer to the next element
            } else{
                temp.add(arr[j]); // Right element is smaller, add it
                j++; // Shift the pointer to the next element
            }
        }
        while(i<=m){ // add any remaining elements from left half
            temp.add(arr[i]);
            i++;
        }
        while(j<=r){ // add any remaining elements from right half
            temp.add(arr[j]);
            j++;
        }
        for(i=l;i<=r;i++){ // merge newly sorted array into original array
            arr[i]=temp.get(i-l); // i-l converts temp index into orginal index
        }
    }  
}