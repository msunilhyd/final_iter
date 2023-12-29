package com.sunil.redis.ds;

public class HouseRobber {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(find(nums));
    }

    public static int find(int[] nums) {
        int max = 0;
        int rob1 = 0;
        int rob2 = 0;

        for (int i=0; i<nums.length; i++) {
            max = Math.max(max, rob1+nums[i]);
            rob1 = rob2;
            rob2 = max;
        }
        return max;
    }
}
