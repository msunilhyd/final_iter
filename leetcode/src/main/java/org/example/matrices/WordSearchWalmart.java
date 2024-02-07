package org.example.matrices;

public class WordSearchWalmart {

    public static char[][] matrix;
    public static int rows;
    public static int cols;
    public static void main(String[] args) {
        matrix = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(exists("ABCCEE"));
    }

    public static boolean exists(String str) {
        rows = matrix.length;
        cols = matrix[0].length;

        for(int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if(find(i, j, str, 0) == true)
                    return true;
            }
        }
        return false;
    }

    public static boolean find(int i, int j, String str, int index) {
        if (index >= str.length())
            return true;
        if (i >= rows || j >= cols || str.charAt(index) != matrix[i][j])
            return false;
        matrix[i][j] = '&';
        int[] rowDir = {1, 0};
        int[] colDir = {0, 1};
        boolean search = false;
        for(int d=0; d<2; d++) {
            search = find(i+rowDir[d], j+colDir[d], str, index + 1);
            if(search)
                break;
        }
        matrix[i][j] = str.charAt(index);
        return search;
    }
}
