package org.benga.cc.sudoku.Solver.sudokuSolver;

public class Main {

    public static void main(String[] args) {
        //"1 2 3 6 7 8 9 4 5 |
        // 5 8 4 2 3 9 7 6 1 |
        // 9 6 7 1 4 5 3 2 8 |
        // 3 7 2 4 6 1 5 8 9 |
        // 6 9 1 5 8 3 2 7 4 |
        // 4 5 8 7 9 2 6 1 3 |
        // 8 3 6 9 2 4 1 5 7 |
        // 2 1 9 8 5 7 4 3 6 |
        // 7 4 5 3 1 6 8 9 2" - solved
        public static String testInput = new String("0 2 0 6 0 8 0 0 0 | 5 8 0 0 0 9 7 0 0 | 0 0 0 0 4 0 0 0 0 | 3 7 0 0 0 0 5 0 0 | 6 0 0 0 0 0 0 0 4 | 0 0 8 0 0 0 0 1 3 | 0 0 0 0 2 0 0 0 0 | 0 0 9 8 0 0 0 3 6 | 0 0 0 3 0 6 0 9 0"); //unsolved

        public static void main(String[] args) {
            // write your code here
            int[][] matrix;
            SudokuUtils utl = new SudokuUtils();
            matrix = utl.toMatrix(testInput);
            for(int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++)
                    System.out.print(matrix[i][j]);
                System.out.println();
            }
    }
}
