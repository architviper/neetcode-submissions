class Solution {
    public int maxProfit(int[] prices) {
        int currMin = Integer.MAX_VALUE;
        int ans = 0;
        for (int price: prices) {
            currMin = Math.min (currMin, price);
            int currProfit =  price - currMin;
            ans = Math.max(ans,currProfit);
        }
        return ans;
        
    }
}
