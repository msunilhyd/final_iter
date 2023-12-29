package com.sunil.redis.ds;

import java.util.Arrays;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(find(3, 7));
    }

    public static int find(int m, int n) {
        int[][] mat = new int[m][n];
        for (int[] arr: mat)
            Arrays.fill(arr, 1);

        for (int i=1; i<m; i++) {
            for (int j=1; j<n; j++) {
                mat[i][j] = mat[i-1][j] + mat[i][j-1];
            }
        }
        return mat[m-1][n-1];
    }
}
