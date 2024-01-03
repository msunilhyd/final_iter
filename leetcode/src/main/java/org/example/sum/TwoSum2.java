package org.example.sum;

import java.util.Arrays;

public class TwoSum2 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(find(nums, 51)));
    }

    public static int[] find(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] ans = new int[2];

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                ans[0]=left;
                ans[1] = right;
                return ans;
            } else if (sum < target)
                left++;
            else
                right--;
        }
        return null;
    }
}
