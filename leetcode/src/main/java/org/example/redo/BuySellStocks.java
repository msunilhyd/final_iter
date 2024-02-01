package org.example.redo;

public class BuySellStocks {
    public static void main(String[] args) {
        int[] nums = {0, 2, 6, 7, 1, 8, 9};
        System.out.println(find(nums));
    }

    public static int find(int[] nums) {
        int maxProfit = 0;
        int min = nums[0];

        for (int i=0; i<nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
            maxProfit = Math.max(maxProfit, nums[i] - min);
        }
        return maxProfit;
    }
}
