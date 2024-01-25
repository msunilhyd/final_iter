package org.example.matrices;

public class WordSearch {

    public static char[][] board;
    public static int rows;
    public static int cols;

    public static void main(String[] args) {

    }

    public static boolean exists(char[][] board, String word) {

        board = board;
        rows = board.length;
        cols = board[0].length;

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (backtrack(i, j, word, 0))
                    return true;
            }
        }
        return false;
    }

    public static boolean backtrack(int i, int j, String word, int index) {
        if (index >= word.length()) {
            return true;
        }
        if (i < 0 || i >= rows || j < 0 || j >= cols || board[i][j] != word.charAt(index)) {
            return false;
        }
        int[] rowDir = {0, 1, 0, -1};
        int[] colDir = {1, 0, -1, 0};
        board[i][j] = '#';

        boolean ret = false;
        for (int d=0; d<4; d++) {
            ret = backtrack(i + rowDir[d], j+colDir[d], word, index+1);
            if (ret)
                break;
        }
        board[i][j] = word.charAt(index);
        return ret;
    }
}
