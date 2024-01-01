package com.sunil.redis.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonOverlappingIntervals {

    public static void main(String[] args) {
        int[] arr1 = {0, 30};
        int[] arr4 = {5, 10};
        int[] arr5 = {15, 20};

        int[][] edges = {arr1, arr4, arr5};
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
        int counter = 1;
        for (int i=1; i<intervals.length; i++) {
            int[] lastAdded = list.get(list.size()-1);
            int[] curInterval = intervals[i];
            if (curInterval[0] >= lastAdded[1]) {
                list.add(curInterval);
            } else {
                counter += 1;
            }
        }
        System.out.println(counter);
        return list.toArray(new int[list.size()][2]);
    }
}
