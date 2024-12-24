class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++){
            int profit = 0;
            if(minPrice> prices[i]){
                minPrice = prices[i];
            }
            else{
                
               profit= prices[i]- minPrice;
               minPrice=prices[i];
            }
            maxProfit += profit;
        }
        return maxProfit;
    }
}