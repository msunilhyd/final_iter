package org.example.matrices;

import java.util.Arrays;

public class RotateMatrix2 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 4}, {3, 5, 7}, {6, 9, 0}};
        printMatrix(matrix);
        rotate(matrix);
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
    }
    public static void rotate(int[][] matrix) {

        int l = 0;
        int r = matrix.length - 1;

        while (l < r) {
            for (int i=0; i<(r - l); i++) {
                int top = l;
                int bottom = r;

                int topLeft = matrix[top][l + i];

                matrix[top][l + i] = matrix[bottom - i][l];
                matrix[bottom - i][l] = matrix[bottom][r - i];
                matrix[bottom][r - i] = matrix[top + i][r];
                matrix[top + i][r] = topLeft;
            }
            r -= 1;
            l += 1;
        }
    }
}
