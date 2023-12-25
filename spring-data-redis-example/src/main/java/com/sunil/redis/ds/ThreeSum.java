package com.sunil.redis.ds;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-2, -1, -1, 0, 1, 2};
        List<List<Integer>> lists = find(nums);
        Set<List<Integer>> set = new HashSet<>(lists);
        List<List<Integer>> distinctLists = new ArrayList<>(set);
        for(List<Integer> list: distinctLists)
            System.out.println(list);
    }
    public static List<List<Integer>> find(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i=0; i<nums.length - 2; i++){
            twoSum(i, nums, list);
        }
        return list;
    }
    public static void twoSum(int i, int[] nums, List<List<Integer>> parentList) {
        int left = i+1;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum == 0) {
                parentList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left += 1;
                right -= 1;
            }
            else if (sum < 0)
                left += 1;
            else
                right -= 1;
        }
    }
}
