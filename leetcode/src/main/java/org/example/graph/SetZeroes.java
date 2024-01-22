package org.example.graph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetZeroes {

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (matrix[i][j] == 0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        for (int i : rowSet) {
            for (int j=0; j<cols; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int j : colSet) {
            for (int i=0; i<rows; i++) {
                matrix[i][j] = 0;
            }
        }
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
