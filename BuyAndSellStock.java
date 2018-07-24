/*Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.*/

class Solution {
    public int maxProfit(int[] prices) {

        /* First find the minimum of the array, then find the maximum in the array of [minimum:] */
        /* Do NOT sort the array as the order of the array corresponds to the days of the week */
        /* Cannot use binary search */
        
        int minBuyVal = Integer.MAX_VALUE; 
        int maxSellVal = Integer.MIN_VALUE;
        int buyDay = 0; 
        
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < minBuyVal){
                minBuyVal = prices[i];
                buyDay = i;
            }
        }
        
        for (int j = buyDay; j < prices.length; j++){
            if (prices[j] > maxSellVal){
                maxSellVal = prices[j];
            }
        }
        
        int maxDiff = maxSellVal - minBuyVal;  
        return maxDiff;
        
    }
}