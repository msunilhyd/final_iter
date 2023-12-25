package com.sunil.redis.ds;

public class buySellStocks {

    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 3, 7, 9, 2};
        System.out.println(buySell(nums));
    }

    public static int buySell(int[] nums) {

        int maxProfit = 0;
        int min = nums[0];

        for (int num : nums) {
            if (num < min)
                min = num;
            int curProfit = num - min;
            maxProfit = Math.max(curProfit, maxProfit);
        }
        return maxProfit;
    }
}
