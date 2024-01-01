package com.sunil.redis.ds;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetZeroes {

    public static void main(String[] args) {
        int[] row1 = {1, 2, 3};
        int[] row2 = {4, 4, 5};
        int[] row3 = {7, 0, 1};
        int[] row4 = {6, 9, 0};

        int[][] matrix = {row1, row2, row3, row4};
        setZeroes(matrix);
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void setZeroes(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if (matrix[i][j] == 0) {
                    if (!rowSet.contains(i)) {
                        rowSet.add(i);
                        for (int k=0; k<c; k++) {
                            matrix[i][k] = 0;
                        }
                    }
                    if (!colSet.contains(j)) {
                        colSet.add(j);
                        for (int k=0; k<r; k++) {
                            matrix[k][j] = 0;
                        }
                    }
                }
            }
        }
//        for (int i : rowSet) {
//            for (int j=0;j<c;j++) {
//                matrix[i][j] = 0;
//            }
//        }
//
//        for (int j: colSet) {
//            for (int i=0; i<r; i++) {
//                matrix[i][j] = 0;
//            }
//        }
    }
}
