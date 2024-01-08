package org.example.dp;

public class UniquePaths {

    public static void main(String[] args) {
        System.out.println(find(3, 3));
    }

    public static int find(int m, int n) {
        int[][] matrix = new int[m][n];

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++) {
                if (i == 0 || j == 0) {
                    matrix[i][j] = 1;
                    continue;
                }
                matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
            }
        }
        return matrix[m-1][n-1];
    }
}
