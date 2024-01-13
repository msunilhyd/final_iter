package org.example.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlantic {

    public static List<List<Integer>> ans = new ArrayList<>();
    public static int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 5};
        int[] arr2 = {3, 2, 3, 4, 4};
        int[] arr3 = {2, 4, 5, 3, 1};
        int[] arr4 = {6, 7, 1, 4, 5};
        int[] arr5 = {5, 1, 1, 2, 4};
        int[][] heights = {arr1, arr2, arr3, arr4, arr5};
        find(heights);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }


    public static void find(int[][] heights) {
        if (heights.length == 0 || heights[0].length == 0)
            return;
        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] pacificReachable = new boolean[rows][cols];
        boolean[][] atlanticReachable = new boolean[rows][cols];

        for (int j=0; j<cols; j++) {
            dfs(0, j, heights, pacificReachable);
            dfs(rows-1, j, heights, atlanticReachable);
        }

        for (int i=0; i<rows; i++) {
            dfs(i, 0, heights, pacificReachable);
            dfs(i, cols-1, heights, atlanticReachable);
        }

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (pacificReachable[i][j] && atlanticReachable[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }
    }

    public static void dfs(int i, int j, int[][] heights, boolean[][] reachable) {
        int rows = heights.length;
        int cols = heights[0].length;

        reachable[i][j] = true;
        for (int[] direction : directions) {
            int newRow = i + direction[0];
            int newCol = j + direction[1];
            if (newRow<0 || newRow>=rows || newCol<0 || newCol>=cols)
                continue;
            if (reachable[newRow][newCol])
                continue;
//            if (heights[i][j] < heights[newRow][newCol])
//                continue;
            if (heights[newRow][newCol] < heights[i][j]) {
                System.out.println("heights[newRow][newCol] = " + heights[newRow][newCol]);
                System.out.println("newRow = " + newRow + " [newCol] = " + newCol);
                System.out.println("heights[i][j] = " + heights[i][j]);
                System.out.println("i = " + i + " j = " + j);
                continue;
            }
            dfs(newRow, newCol,heights, reachable);
        }
    }
}
