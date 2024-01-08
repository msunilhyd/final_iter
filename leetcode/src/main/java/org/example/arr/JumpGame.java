package org.example.arr;

public class JumpGame {

    public static void main(String[] args) {
        int[] nums = {0, 3, 2, 1, 0, 4};

        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int reachable = 0;

        for (int i=0; i<nums.length; i++) {
            if (reachable < i)
                return false;
            reachable = Math.max(reachable, nums[i] + i);
        }
        return true;
    }
}
