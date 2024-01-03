package org.example.dp;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubSequence {

    public static void main(String[] args) {
        int[] nums = {1, -2, -3, 0, 2, 7, 3, 4, 9, 5};
        find(nums);
    }
    public static int find(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i=1; i<nums.length; i++) {
            if (nums[i] > list.get(list.size()-1))
                list.add(nums[i]);
            else{
                list.remove(0);
                list.add(0, nums[i]);
            }
        }
        System.out.println(list);
        return list.size();
    }
}
