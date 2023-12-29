package com.sunil.redis.ds;

public class JumpGame {

    public static void main(String[] args) {
        int[] nums = {2, 0, 0, 0, 4};
        System.out.println(find(nums));
    }

    public static boolean find(int[] nums) {

        int goal = nums.length-1;
        for (int i=nums.length-1; i>=0; i--) {
            if (i + nums[i] >= goal)
                goal = i;
        }
        if (goal == 0)
            return true;
        return false;
    }
}
