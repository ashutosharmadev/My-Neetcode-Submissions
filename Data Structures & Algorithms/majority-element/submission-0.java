class Solution {
    public int majorityElement(int[] nums) {
     Map<Integer,Integer>map=new HashMap<>(); // Initialise Hashmap
     int n=nums.length; // Size
     for(int num:nums){ // Traverse
        map.put(num,map.getOrDefault(num,0)+1); // Add to map nums and if num is in num get count otherwise 0 and increment it

     if(map.get(num)>n/2){ // if you get map has num >n/2
        return num; // return majority element
     }
    }
    return -1;
}
}