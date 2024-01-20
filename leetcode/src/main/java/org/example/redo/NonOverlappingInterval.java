package org.example.redo;

import java.util.Arrays;

public class NonOverlappingInterval {

    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println(eraseOverlappingInterval(intervals));
        System.out.println(1/10);
    }

    public static int eraseOverlappingInterval(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int prev = 0;
        int count = 0;

        for (int i=1; i<intervals.length; i++) {
            if (intervals[prev][1] > intervals[i][0]) {
                count++;
                if (intervals[prev][1] > intervals[i][1]) {
                    prev = i;
                }
            } else {
                prev = i;
            }
        }
        return count;
    }
}
