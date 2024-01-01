package com.sunil.redis.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr4 = {8, 10};
        int[] arr5 = {15, 18};
        int[] arr2 = {2, 6};

        int[][] edges = {arr1, arr5, arr4, arr2};
        int[][] intervals = insertInterval(edges);
        System.out.println("=============");
        for (int[] arr:intervals) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[][] insertInterval(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//        for (int[] arr : intervals)  {
//            System.out.println(Arrays.toString(arr));
//        }
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);

        for (int i=1; i<intervals.length; i++) {
            int[] lastAdded = list.get(list.size()-1);
            int[] curInterval = intervals[i];
            if (curInterval[0] > lastAdded[1]) {
                list.add(curInterval);
            } else {
                curInterval[0] = Math.min(curInterval[0], lastAdded[0]);
                curInterval[1] = Math.max(curInterval[1], curInterval[1]);
                list.remove(lastAdded);
                list.add(curInterval);
            }
        }

        return list.toArray(new int[list.size()][2]);
    }
}
