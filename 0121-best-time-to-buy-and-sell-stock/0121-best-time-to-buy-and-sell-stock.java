class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int l=prices.length;
        int buy=Integer.MAX_VALUE;

        for(int i=0;i<l;i++){
            buy=Math.min(buy,prices[i]);
            int sell=prices[i];
            int profit=sell-buy;
            max=Math.max(max,profit);

        }
        return max;
    }
}