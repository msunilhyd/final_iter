package org.example.arr;

import java.util.Arrays;
import java.util.LinkedList;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        for (int[] interval : insert(intervals, newInterval)) {
            System.out.println(Arrays.toString(interval));
        }
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int newStart = newInterval[0];
        int newEnd = newInterval[1];
        int left = 0;
        int right = intervals.length;

        LinkedList<int[]> output = new LinkedList<int[]>();

        while(left < right && newStart>intervals[left][0]) {
            output.add(intervals[left]);
            left++;
        }
        int[] interval = new int[2];
        if (output.isEmpty() || output.getLast()[1] < newStart) {
            output.add(newInterval);
        } else {
            interval = output.removeLast();
            interval[1] = Math.max(interval[1], newEnd);
            output.add(interval);
        }

        while (left < right) {
            interval = intervals[left];
            left++;
            if (output.getLast()[1] < interval[0])
                output.add(interval);
            else {
                int[] existing = output.getLast();
                existing[1] = Math.max(existing[1], interval[1]);
                output.add(existing);
            }
        }
        return output.toArray(new int[output.size()][2]);
    }
}
