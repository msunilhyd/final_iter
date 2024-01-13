package org.example.redo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlantic {

    public static int rows = 0;
    public static int cols = 0;
    public static int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public static List<List<Integer>> ansList = new ArrayList<>();

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 5};
        int[] arr2 = {3, 2, 3, 4, 4};
        int[] arr3 = {2, 4, 5, 3, 1};
        int[] arr4 = {6, 7, 1, 4, 5};
        int[] arr5 = {5, 1, 1, 2, 4};
        int[][] heights = {arr1, arr2, arr3, arr4, arr5};
        find(heights);
        for (List<Integer> list : ansList) {
            System.out.println(list);
        }
    }

    public static void find(int[][] heights) {
        if (heights.length == 0 || heights[0].length == 0)
            return;
        rows = heights.length;
        cols = heights[0].length;
        boolean[][] pacificReachable = new boolean[rows][cols];
        boolean[][] atlanticReachable = new boolean[rows][cols];

        for (int j=0; j<cols; j++) {
            dfs(0, j, pacificReachable, heights);
            dfs(rows-1, j, atlanticReachable, heights);
        }

        for (int i=0; i<rows; i++) {
            dfs(i, 0, pacificReachable, heights);
            dfs(i, cols-1, atlanticReachable, heights);
        }

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (pacificReachable[i][j] && atlanticReachable[i][j]) {
                    ansList.add(Arrays.asList(i, j));
                }
            }
        }
    }

    public static void dfs(int i, int j, boolean[][] reachable, int[][] heights) {
        reachable[i][j] = true;
        for (int[] direction : directions) {
            int newRow = i + direction[0];
            int newCol = j + direction[1];

            if (newRow <0 || newRow >= rows || newCol <0 || newCol >= cols)
                continue;
            if (reachable[newRow][newCol])
                continue;
            if (heights[newRow][newCol] < heights[i][j])
                continue;
            dfs(newRow, newCol, reachable, heights);
        }
    }
}
