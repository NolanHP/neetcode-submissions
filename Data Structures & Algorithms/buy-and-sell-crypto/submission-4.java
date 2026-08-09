class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int maxPro = 0;

        for(int r = 1; r<prices.length;){
            if(prices[l] < prices[r]){
                int profit = prices[r]-prices[l];
                if(profit>maxPro){maxPro = profit;}
            }else{
                l = r;
            }
            r++;
        }
        return maxPro;
    }
}
