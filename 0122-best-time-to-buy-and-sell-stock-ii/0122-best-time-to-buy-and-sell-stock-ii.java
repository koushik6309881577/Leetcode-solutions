class Solution {
    public int maxProfit(int[] prices) {
        int pr=0;
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i]<prices[i+1])
            pr+=prices[i+1]-prices[i];

        }
        return pr;
        
    }
}