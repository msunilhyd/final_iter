package com.sunil.redis.ds;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static void main(String[] args) {
        int[] nums = {2, 8, 7, 5};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int i=0;
        for (int num : nums) {
            int diff = target - num;
            if (map.containsKey(diff))
                return new int[] {i, map.get(diff)};
            map.put(num, i);
            i += 1;
        }
        return null;
    }
}
