package org.example.arr;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {

    public static LinkedList<int[]> output = new LinkedList<>();
    public static int[][] intervals;
    public static void main(String[] args) {
        intervals = new int[][]{{1, 3}, {2, 6}, {8, 16}, {15, 18}};
        for (int[] interval : mergeInervals(intervals)) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static int[][] mergeInervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for (int[] interval : intervals) {
            if (output.isEmpty() || output.getLast()[1] < interval[0])
                output.add(interval);
            else {
                output.getLast()[1] = Math.max(output.getLast()[1], interval[1]);
            }
        }
        return output.toArray(new int[output.size()][2]);
    }
}
