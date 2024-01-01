package com.sunil.redis.ds;

import java.util.Arrays;

public class RotateMatrix {

    public static void main(String[] args) {

        int[] row1 = {1, 2, 3};
        int[] row2 = {4, 4, 5};
        int[] row3 = {7, 0, 1};

        int[][] matrix = {row1, row2, row3};
        rotate(matrix);
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i=0; i<(n+1)/2; i++) {
            for (int j=0; j< n/2; j++) {
                int temp = matrix[n-1-j][i];

                matrix[n-1-j][i] = matrix[n-1-i][n-j-1];
                matrix[n-1-i][n-j-1] = matrix[j][n-1-i];
                matrix[j][n-1-i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
