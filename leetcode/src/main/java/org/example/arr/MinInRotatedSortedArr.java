package org.example.arr;

public class MinInRotatedSortedArr {

    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int min = nums[0];
        while (left <= right) {
            min = Math.min(min, nums[left]);
            mid = (left + right) / 2;
            if (nums[mid] >= nums[left])
                left = mid + 1;
            if (nums[mid] < nums[right])
                right = mid - 1;
        }
        return min;
    }
}
