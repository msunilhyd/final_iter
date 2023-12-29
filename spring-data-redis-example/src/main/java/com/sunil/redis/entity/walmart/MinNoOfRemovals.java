package com.sunil.redis.entity.walmart;

public class MinNoOfRemovals {

    public static void main(String[] args) {
        int[] nums = {5, 2, 6};
        System.out.println(find(nums));
    }

    public static int find(int[] nums) {

        int count = 0;
        if (nums.length < 3)
            return 0;

        for (int i=0; i<nums.length - 2; i++) {
            if (nums[i] < nums[i+1] && nums[i+1] < nums[i+2] || nums[i] > nums[i+1] && nums[i+1] > nums[i+2])
                count += 1;
        }
        return count;
    }
}
