package com.sunil.redis.ds;

import java.util.Arrays;

public class prodOfArrExSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(prod(nums)));
    }

    public static int[] prod(int[] nums) {
        int pre = 1;
        int post = 1;

        int[] result = new int[nums.length];

        for (int i=0; i<nums.length; i++) {
            result[i] = pre;
            pre = pre * nums[i];
        }
//        [1, 1, 2, 6]
        for (int i=nums.length -1; i>=0; i--) {
            result[i] = result[i] * post;
            post = post * nums[i];
        }

        return result;
    }
}
