package org.example.sum;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {2, 0, -1, 1, -1, -2, 3};
        int[][] ans = find(nums);
        for (int[] arr : ans) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[][] find(int[] nums) {
        Arrays.sort(nums);

//        [-2, -1, 0, 1, 2, 3]
        List<int[]> ansList = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int cur = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            if (i>0 && cur == nums[i-1])
                continue;
            while (left < right) {
                int sum = cur + nums[left] + nums[right];
                if (sum == 0) {
                    int[] arr = {cur, nums[left], nums[right]};
                    ansList.add((arr));
                    left++;
                    right--;
                } else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }
        int[][] ans = ansList.toArray(new int[ansList.size()][ansList.get(0).length]);
        return ans;
    }
}

