package org.example.redo;

public class RobHouse {

    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 5, 1, 1};
        System.out.println(find(nums));
    }

    public static int find(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;
        int max = 0;
        for (int i=0; i<nums.length; i++) {
            max = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = max;
        }
        return max;
    }
}
