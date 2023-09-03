class Solution {
    public int maxProfit(int[] prices) {
        int profit=0; int min=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min)min=prices[i];
            
            if(prices[i]-min>profit)
                profit=prices[i]-min; 
        }
        return profit;
    }
}
