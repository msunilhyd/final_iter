package com.sunil.redis.ds;

public class MinInRotSortArr2 {

    public static void main(String[] args) {
        int[] nums = {7, 2, 3, 4, 5, 6};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = nums[0];
        while (left < right) {
            if (nums[left] < nums[right])
                min = Math.min(min, nums[left]);
            int mid = (left + right) / 2;
            min = Math.min(min, nums[mid]);
            if (nums[left] < nums[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return min;
    }
}
