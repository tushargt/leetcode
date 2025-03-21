package codingpractice.lc150;

/**

 You are given an array prices where prices[i] is the price of a given stock on the ith day.
 You want to maximize your profit by choosing a single day to buy one stock and choosing a
 different day in the future to sell that stock.
 Return the maximum profit you can achieve from this transaction.
 If you cannot achieve any profit, return 0.

 Example 1:

 Input: prices = [7,1,5,3,6,4]
 Output: 5
 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 Example 2:

 Input: prices = [7,6,4,3,1]
 Output: 0
 Explanation: In this case, no transactions are done and the max profit = 0.


 Constraints:

 1 <= prices.length <= 105
 0 <= prices[i] <= 104
 */

public class MaxProfit {

    private static int maxPrice(int[] prices) {
        if(prices.length == 1)
            return 0;

        int buyIndex = 0;
        int sellIndex = 1;
        int profit = 0;

        while (sellIndex < prices.length) {
            if(prices[buyIndex] >= prices[sellIndex]) {
                buyIndex = sellIndex;
            } else {
                profit = Math.max(prices[sellIndex] - prices[buyIndex], profit);
            }
            sellIndex++;
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices_1 = {7,1,5,3,6,4};
        int[] prices_2 = {7,6,4,3,1};
        int[] prices_3 = {1,2,4,2,5,7,2,4,9,0,9};

        System.out.println("Max profit for first input set: " + maxPrice(prices_1));
        System.out.println("Max profit for second input set: " + maxPrice(prices_2));
        System.out.println("Max profit for third input set: " + maxPrice(prices_3));
    }
}
