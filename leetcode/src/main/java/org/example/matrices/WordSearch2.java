package org.example.matrices;

public class WordSearch2 {
    public static int rows;
    public static int cols;
    public static char[][] board;
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(find(board, "ABCCEE"));
    }

    public static boolean find(char[][] charBoard, String str) {
        board = charBoard;
        rows = board.length;
        cols = board[0].length;
        boolean possible;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                possible = backtrack(i, j, str, 0);
                if (possible)
                    return true;
            }
        }
        return false;
    }

    public static boolean backtrack(int i, int j, String str, int index) {
        if (index >= str.length())
            return true;
        if (i < 0 || i >= rows || j < 0 || j >= cols || board[i][j] != str.charAt(index))
            return false;

        board[i][j] = '#';
        boolean ret = false;
        int[] rowdir = {0, 0, 1, -1};
        int[] coldir = {1, -1, 0, 0};

        for (int k=0; k<=3; k++){
            ret = backtrack(i+rowdir[k], j+coldir[k], str, index+1);
            if (ret)
                break;
        }
        board[i][j] = str.charAt(index);
        return ret;
    }
}
