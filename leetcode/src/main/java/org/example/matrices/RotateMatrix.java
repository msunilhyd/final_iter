package org.example.matrices;

import java.util.Arrays;

public class RotateMatrix {

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
        int n = matrix.length;
        for (int i=0; i<(n+1)/2; i++) {
            for (int j=0; j<n/2; j++) {
                int temp = matrix[n-1-j][i];

                matrix[n-1-j][i] = matrix[n-1-i][n-j-1];
                matrix[n-1-i][n-j-1] = matrix[j][n-1-i];
                matrix[j][n-1-i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
