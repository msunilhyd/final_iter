package org.example.redo;

import java.util.Arrays;

public class ProdOfArrExSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        find(nums);
    }

    public static int[] find(int[] nums) {
        int pre = 1;
        int post = 1;

        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);

        for (int i=0; i<nums.length; i++) {
            ans[i] = pre;
            pre = pre * nums[i];
        }

        for (int i=nums.length-1; i>=0; i--) {
            ans[i] = post * ans[i];
            post = post * nums[i];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
