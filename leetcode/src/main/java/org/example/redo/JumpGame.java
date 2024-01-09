package org.example.redo;

public class JumpGame {

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 3};

        System.out.println(find(nums));
    }

    public static boolean find(int[] nums) {
        int reachable = 0;
        for (int i=0; i<nums.length;i++) {
            if (reachable < i) {
                return false;
            }
            reachable = Math.max(reachable, i+nums[i]);
        }
        return true;
    }
}
