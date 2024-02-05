package org.example.redo;

import java.util.Arrays;

public class TwoSum2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        System.out.println(Arrays.toString(find(arr, 133)));
    }

    public static int[] find(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while(l < r) {
            int sum = arr[l] + arr[r];
            if (target == sum)
                return new int[]{l, r};
            if (sum < target)
                l++;
            else
                r--;
        }
        return null;
    }
}
