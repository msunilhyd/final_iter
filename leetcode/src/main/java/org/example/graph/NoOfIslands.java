package org.example.graph;

public class NoOfIslands {

    public static int rows = 0;
    public static int cols = 0;
    public static int[][] directions = {{1, 0}, {-1, 0}, {0, 1},
            { 0, -1}};
    public static void main(String[] args) {
        char[] arr1 = {'1','1','0','0','0'};
        char[] arr2 = {'1','1','0','0','0'};
        char[] arr3 = {'0','0','1','0','0'};
        char[] arr4 = {'0','0','0','1','1'};

        char[][] grid = {arr1, arr2, arr3, arr4};
        System.out.println(find(grid));
    }

    public static int find(char[][] grid) {
        if (grid.length == 0)
            return 0;
        rows = grid.length;
        cols = grid[0].length;
        int noOfIslands = 0;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, grid);
                    noOfIslands += 1;
                }
            }
        }
        return noOfIslands;
    }

    public static void dfs(int i, int j, char[][] grid) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0' || grid[i][j] == '2') {
            return;
        }
        grid[i][j] = '2';

        for (int[] direction : directions) {
            dfs(i+direction[0], j+direction[1], grid);
        }
    }
}
