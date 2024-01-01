package com.sunil.redis.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 5};
        int[] arr3 = {6, 7};
        int[] arr4 = {8, 10};
        int[] arr5 = {12, 16};

        int[][] edges = {arr1, arr2, arr3, arr4, arr5};
        int[] newInterval = {4, 8};
        int[][] intervals = insertInterval(edges, newInterval);
        for (int[] arr:intervals) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[][] insertInterval(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (newInterval[1] < intervals[i][0]) {
                list.add(newInterval);
                while (i < intervals.length) {
                    list.add(intervals[i]);
                    i++;
                }
                return list.toArray(new int[list.toArray().length][2]);
            } else if (newInterval[0] > intervals[i][1]) {
                list.add(intervals[i]);
            } else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        return list.toArray(new int[list.size()][2]);
    }
}
