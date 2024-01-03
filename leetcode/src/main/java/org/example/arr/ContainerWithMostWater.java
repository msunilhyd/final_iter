package org.example.arr;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 1, 2, 8, 3};
        System.out.println(find(nums));
    }

    public static int find(int[] nums) {
        int maxArea = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int area = Math.min(nums[left], nums[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (nums[left] < nums[right])
                left++;
            else right--;
        }
        return maxArea;
    }
}
