package org.example.arr;

public class MaxProdSubArr {
    public static void main(String[] args) {
        int[] nums = { -2, -4, 2, 5, -3};
        System.out.println(find(nums));
    }
    public static int find(int[] nums) {
        int maxProd = Integer.MIN_VALUE;
        int curProd = 1;

        for (int i=0; i<nums.length; i++) {
            curProd = curProd * nums[i];
            maxProd = Math.max(curProd, maxProd);
            if (curProd == 0)
                curProd = 1;
        }
        curProd = 1;
        int maxProd1 = Integer.MIN_VALUE;
        for (int i=nums.length-1; i>=0; i--) {
            curProd = curProd * nums[i];
            maxProd1 = Math.max(curProd, maxProd1);
        }
        return Math.max(maxProd, maxProd1);
    }
}
