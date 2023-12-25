package com.sunil.redis.ds;

public class maxProdSubArr {

    public static void main(String[] args) {
        int[] nums = {2, 3, -4, 3, -2, 2};
        System.out.println(maxProd(nums));
    }

    public static int maxProd(int[] nums) {

        int curMin = 1;
        int curMax = 1;
        int max = 1;

        for (int num : nums) {
            int temp = Math.max(curMax * num, curMin * num);
            curMin = Math.min(curMax * num, curMin * num);
            curMax = temp;
            max = Math.max(curMax, max);
        }
        return max;
    }
}
