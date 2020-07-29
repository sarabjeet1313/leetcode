// time to sell and buy stock with cooldown.


class Solution {
    public int maxProfit(int[] prices) {
        
        int len = prices.length;
        if(len <= 1)
            return 0;
        
        if(len == 2 && prices[1] > prices[0])
            return prices[1] - prices[0];
        
        else if(len == 2 && prices[1] < prices[0])
            return 0;
        
        int[][] inHand = new int[len][2];
        
        inHand[0][0] = 0;
        inHand[0][1] = -prices[0];
        inHand[1][0] = Math.max(inHand[0][0] , inHand[0][1] + prices[1]);
        inHand[1][1] = Math.max(inHand[0][1] , inHand[0][0] - prices[1]);
        
        for(int i=2; i < len; i++){
            inHand[i][0] = Math.max(inHand[i-1][0] , inHand[i-1][1] + prices[i]);
            inHand[i][1] = Math.max(inHand[i-1][1], inHand[i-2][0] - prices[i]); 
        }
        return inHand[len-1][0];
    }
}
