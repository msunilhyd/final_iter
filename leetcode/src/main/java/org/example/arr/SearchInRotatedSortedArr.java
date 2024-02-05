package org.example.arr;

public class SearchInRotatedSortedArr {

    public static void main(String[] args) {
//        int[] nums = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int[] nums = {4, 5, 6, 7, 8, 9, 0, 1, 2, 3};

        System.out.println(find(nums, 0));
    }
    public static int find(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == nums[mid])
                return mid;
            if (nums[mid] <= nums[right]){
                if (target > nums[right] || target < nums[mid]) {
                    right = mid - 1;
                } else
                    left = mid + 1;
            }
//            int[] nums = {4, 5, 6, 7, 8, 9, 1, 2, 3};
            else {
                if (target > nums[mid] || target < nums[left]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
