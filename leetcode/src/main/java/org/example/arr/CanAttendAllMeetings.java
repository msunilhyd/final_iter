package org.example.arr;

import java.util.Arrays;

public class CanAttendAllMeetings {

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(canAttend(intervals));
    }

    public static boolean canAttend(int[][] intervals) {
        if (intervals.length == 0)
            return false;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i=0; i<intervals.length - 1; i++) {
            if (intervals[i][1] < intervals[i+1][0])
                return false;
        }
        return true;
    }
}
