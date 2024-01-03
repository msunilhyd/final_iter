package org.example.arr;

public class MaxSumSubArr {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4, 99};
        System.out.println(find(nums));
    }

    public static int find(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];

        int maxSum = 0;
        int curSum = 0;
        for (int i=1; i<nums.length; i++) {
            curSum = curSum + nums[i];
            if (curSum < 0)
                curSum = 0;
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }
}
