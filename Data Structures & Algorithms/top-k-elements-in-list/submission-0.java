class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count= new HashMap<>(); //initialise Hashmap
        for(int num:nums){    // Traverse loop and count the occurences          
            count.put(num, count.getOrDefault(num,0)+1);
        } 
        List<int[]>arr=new ArrayList<>(); //List of arrays [frequency,number]
        for(Map.Entry<Integer, Integer> entry: count.entrySet()){ // Convert the hashmap to list of arrays
            arr.add(new int[]{entry.getValue(), entry.getKey()});
        }
        arr.sort((a,b)-> b[0]-a[0]); // Sort by descending frequency 
        int[] res= new int[k]; // Top K frequent elements 
        for (int i=0; i<k; i++){
            res[i]=arr.get(i)[1];
        }
        return res;
    }
}
