package com.sunil.redis.ds;

public class SearchInRotSortArr {

    public static void main(String[] args) {

        int[] nums = {6, 7, 1, 2, 3, 4, 5};
        System.out.println(find(nums, 3));
    }

    public static int find(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[left] <= nums[mid]) {
                if (target > nums[left] || target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else {
                if (target > nums[right] || target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }
        System.out.println(left);
        System.out.println(right);
        return -1;
    }
}
