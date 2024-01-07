package org.example.matrices;

public class DiffOfDiagnols {

    public static void main(String[] args) {
        int[] r1 = {1, 2, 3};
        int[] r2 = {2, 4, 5};
        int[] r3 = {3, 6, 2};

        int[][] matrix = {r1, r2, r3};
        System.out.println(findDiffOfDiagnols(matrix));
    }

    public static int findDiffOfDiagnols(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int sum1 = 0;
        int sum2 = 0;

        int i=0;
        int j=0;
        while (i<m && j<n) {
            sum1 = sum1 + matrix[i][j];
            i++;
            j++;
        }
        i = 0;
        j = n-1;

        while (i<m && j>=0) {
            sum2 = sum2 + matrix[i][j];
            i++;
            j--;
        }
        return Math.abs(sum1-sum2);
    }
}
