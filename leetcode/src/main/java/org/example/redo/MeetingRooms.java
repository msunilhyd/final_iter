package org.example.redo;

import java.util.Arrays;

public class MeetingRooms {

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(find(intervals));
    }

    public static int find(int[][] intervals) {
        if (intervals.length == 0)
            return 0;
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];

        for (int i=0; i<intervals.length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int result = 0;
        int startPtr = 0;
        int endPtr = 0;

        while (startPtr < start.length) {
            if (start[startPtr] >= end[endPtr]) {
                result--;
                endPtr++;
            }
            result++;
            startPtr++;
        }
        return result;
    }
}
