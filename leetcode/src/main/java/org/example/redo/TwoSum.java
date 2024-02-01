package org.example.redo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 8};
        System.out.println(Arrays.toString(find(nums, 9)));
    }

    public static int[] find(int[] nums, int target) {
        Map<Integer, Integer> diffMap = new HashMap<>();
        int i=0;
        for (int num : nums) {
            int diff = target - num;
            if (diffMap.containsKey(diff)) {
                return new int[]{num, nums[diffMap.get(diff)]};
            } else {
                diffMap.put(num, i);
            }
            i++;
        }
        return null;
    }
}
