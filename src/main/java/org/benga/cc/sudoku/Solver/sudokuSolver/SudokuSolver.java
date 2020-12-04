package org.benga.cc.sudoku.Solver.sudokuSolver;

public class SudokuSolver {
    private int[][] unsolvedMatrix;
    private int[][] solvedMatrix;

    public void Solver(int[][] unsolvedMatrix){
        this.unsolvedMatrix = unsolvedMatrix;
        for (int i = 0; i < 9; i++){
            for (int j = 0; i < 9; j++){
                if(unsolvedMatrix[i][j] != 0 ){
                    solvedMatrix[i][j] = unsolvedMatrix[i][j];
                }
            }
        }
    }
    public void solve(int indexX, int indexY){
        if(solvedMatrix[indexX][indexY] == 0){

        }
    }
}
