package org.example.redo;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(find(matrix));
    }

    public static List<Integer> find(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int row = 0;
        int col = 0;

        int currentDirection = 0;
        int changeDirection = 0;
        int visited = 101;
        List<Integer> path = new ArrayList();
        path.add(matrix[0][0]);
        matrix[0][0] = visited;

        while(changeDirection < 2) {
            while ((row + directions[currentDirection][0]) >= 0 && (row + directions[currentDirection][0]) < rows
             && (col + directions[currentDirection][1]) >= 0 &&
            (col + directions[currentDirection][1]) < cols && matrix[row + directions[currentDirection][0]][col + directions[currentDirection][1]] != visited) {
                changeDirection = 0;
                path.add(matrix[row + directions[currentDirection][0]][col + directions[currentDirection][1]]);
                matrix[row + directions[currentDirection][0]][col + directions[currentDirection][1]] = visited;
                row = row + directions[currentDirection][0];
                col = col + directions[currentDirection][1];

            }
            changeDirection++;
            currentDirection = (currentDirection + 1) % 4;
        }
        return path;
    }
}
