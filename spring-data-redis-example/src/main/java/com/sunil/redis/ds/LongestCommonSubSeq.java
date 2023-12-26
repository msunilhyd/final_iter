package com.sunil.redis.ds;

public class LongestCommonSubSeq {

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(find(s1, s2));
    }

    public static int find(String s1, String s2) {
        int[][] matrix = new int[s1.length() + 1][s2.length() + 1];
        for (int i=s1.length()-1; i>=0; i--) {
            for (int j=s2.length()-1; j>=0; j--) {
                if (s1.charAt(i) == s2.charAt(j))
                    matrix[i][j] = matrix[i+1][j+1] + 1;
                else
                    matrix[i][j] = Math.max(matrix[i+1][j], matrix[i][j+1]);
            }
        }
        return matrix[0][0];
    }
}
