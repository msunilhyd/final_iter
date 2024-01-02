package org.example.sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 18)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ansArr = new int[2];
        for (int i=0; i<nums.length; i++) {
            int diff = target-nums[i];
            if (map.containsKey(diff)) {
                ansArr[0] = map.get(diff);
                ansArr[1] = i;
            }
            else
                map.put(nums[i], i);
        }
        return ansArr;
    }
}
