package com.sunil.redis.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum2 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 7};
        find(nums, 5).forEach(arr -> {System.out.println(Arrays.toString(arr));});
    }

    public static List<int[]> find(int[] nums, int target) {
        List<int[]> list = new ArrayList<>();
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if (nums[left] + nums[right] == target)
                list.add(new int[] {left, right});
            if (nums[left] + nums[right] < target)
                left = left + 1;
            else
                right = right - 1;
        }
        return list;
    }
}
