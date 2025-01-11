class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int least = prices[0];
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            profit = prices[i] - least;
            if(max < profit)
                max = profit;
            else if(least > prices[i])
                least = prices[i];
        
        }
        if(max < 0)
            max = 0;
        return max;
    }
}