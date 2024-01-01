package com.sunil.redis.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeetingRooms {

    public static void main(String[] args) {

        int[] i1 = {0, 30};
        int[] i2 = {5, 10};
        int[] i3 = {15, 20};
        int[][] intervals = {i1, i2, i3};
        System.out.println(meetingRooms(intervals));
    }

    public static int meetingRooms(int[][] intervals) {
        List<Integer> startList = new ArrayList<>();
        List<Integer> endList = new ArrayList<>();

        for (int[] interval : intervals) {
            startList.add(interval[0]);
            endList.add(interval[1]);
        }

        Collections.sort(startList);
        Collections.sort(endList);

        int res = 0;
        int count = 0;
        int start = 0;
        int end = 0;

        while (start < intervals.length) {
            if (startList.get(start) < endList.get(end)) {
                count += 1;
                start += 1;
            } else {
                count -= 1;
                end += 1;
            }
            res = Math.max(res, count);
        }
        return res;
    }
}
