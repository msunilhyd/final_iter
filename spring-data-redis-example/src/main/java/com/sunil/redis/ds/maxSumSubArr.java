package com.sunil.redis.ds;

public class maxSumSubArr {

    public static void main(String[] args) {
        int[] nums = {2, 3, -4, 1, 2, -1, -5};
        System.out.println(maxSum(nums));
    }
    public static int maxSum(int[] nums) {
        int maxSum = 0;
        int curSum = 0;

        for (int num : nums) {
            if (curSum < 0)
                curSum = 0;
            curSum = curSum + num;
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
}
