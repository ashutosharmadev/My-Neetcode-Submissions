class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer>temp= new ArrayList<>(); // this is to create a empty array where we will store all elements that are not equal to the val
        for (int num:nums){ // enhanced for loop to go through each element in the array
            if (num==val) {
                continue; // if num==val then it will skip it and not add it in the temp array
            }
            temp.add(num); //add the numbers in the temp array
        }
        for (int i=0;i<temp.size();i++){
            nums[i]=temp.get(i);
        }
        return temp.size();
    }
}