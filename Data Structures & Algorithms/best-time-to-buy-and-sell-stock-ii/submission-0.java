class Solution {
    public int maxProfit(int[] prices) {
        int profit=0; // Initialise profit
        for(int i=1;i<prices.length;i++){ // Traverse the array
            if(prices[i]>prices[i-1]){ // Check whether today's price is higher than yesterday if so we could bought yesterday and sold today
                profit+=(prices[i]-prices[i-1]); // Calculate the profit
            }
        }
        return profit;
    }
}