package org.example.redo3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 8};
        System.out.println(Arrays.toString(find(arr, 9)));
    }

    public static int[] find(int[] arr, int target) {
        Map<Integer, Integer> diffMap = new HashMap();

        for (int i=0; i<arr.length; i++) {
            int diff = target - arr[i];
            if (diffMap.containsKey(diff)) {
                return new int[] {diff, arr[i]};
            } else {
                diffMap.put(arr[i], 0);
            }
        }
        return new int[]{};
    }
}
