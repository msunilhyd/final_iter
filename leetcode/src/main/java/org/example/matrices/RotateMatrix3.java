package org.example.matrices;

public class RotateMatrix3 {

    public static void main(String[] args) {
    }

    public static void rotate(int[][] matrix) {
        int l = 0;
        int r = matrix.length;

        while(l < r) {
            for (int i=0; i<(r - l); i++) {
                int top = l;
                int bottom = r;

                int topLeft = matrix[top][l + i];

                matrix[top][l + i] = matrix[bottom][r - i];
                matrix[bottom][r - i] = matrix[bottom + i][r - l];
            }
        }
    }
}
