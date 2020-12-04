package org.benga.cc.sudoku.Solver.utils;

public class SudokuUtils {
    public static final int BOARD_SIZE = 9;
    public static final int BLOCK_SIZE = 3;
    public static final int[] EXPECTED = { 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static int[][] toMatrix(String input){
        input = input.replaceAll("[^\\d]", "");
        int [][] matrix = new int[BOARD_SIZE][BOARD_SIZE];
        int [] array = toIntArray(input);
        for(int i = 0; i < BOARD_SIZE; i++)
            for(int j = 0; j < BOARD_SIZE; j++)
                matrix[i][j] = array[i * BOARD_SIZE + j];
        return matrix;
    }

    private static int[] toIntArray(String input) {
        int[] array = new int[input.length()];
        for(int i = 0; i < BOARD_SIZE * BOARD_SIZE; i++) {
            array[i] = Integer.parseInt(input.split("")[i]);
        }
        return array;
    }
}
