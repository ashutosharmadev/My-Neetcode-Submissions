class Solution {
    public void reverseString(char[] s) {
        int l=0, r=s.length-1; // left pointer starting from the start of array of strings and right pointer at the end
        while(l<r){ // Until left pointer and right pointer cross each other
            char temp=s[l]; // Store the left characters temporarily
            s[l]=s[r]; // Shift the right character to left
            s[r]=temp; // store right characters temporarily
            l++; // increment the left pointer 
            r--;// decrement the right pointer
        }
    }
}