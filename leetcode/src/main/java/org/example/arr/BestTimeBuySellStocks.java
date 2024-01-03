package org.example.arr;

public class BestTimeBuySellStocks {

    public static void main(String[] args) {
        int[] prices = {7, 4, 2, 3, 5, 9, 41};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int low = prices[0];

        for (int i=0; i<prices.length; i++) {
            int profit = prices[i] - low;
            max = Math.max(max, profit);
            if (prices[i] < low)
                low = prices[i];
        }
        return max;
    }
}
