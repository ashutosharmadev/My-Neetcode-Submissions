class Solution {
    public int maxProfit(int[] prices) {
        int l=0, r=1; // left pointer represents selling point & right pointer is buying point
        int maxP=0; // Max profit will start at 0
        
        while(r<prices.length){ // As long as r pointer completely traverses the prices array
            if(prices[l]<prices[r]){ // if right pointer is greater then left that means there is a possibility of making profit
                int profit=prices[r]-prices[l]; // Calculating profit
                maxP=Math.max(maxP,profit); // Update maximum profit
            } else{
                l=r; // in the even there is a cheaper buying day
            }
            r++; // right pointer will continue to increment
        }
        return maxP;
    }
}
