package org.benga.cc.sudoku.Solver.sudokuSolver;

public class SudokuSolver {
    private int[][] unsolvedMatrix;
    private int[][] solvedMatrix;
    private boolean finished = false;

    public void Solver(){}

    public void setUnsolvedMatrix(int[][] unsolvedMatrix){
        this.unsolvedMatrix = unsolvedMatrix;
    }

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
    public boolean solve(int indexX, int indexY, int depth, int startingNumber){
        if (depth == 81) return true;
        if (finished) return true;
        if(++indexX == 9){indexX = 0;}
        if(++indexY == 9){indexY = 0;}
        if(solvedMatrix[indexX][indexY] != 0){
            return solve(indexX, indexY, depth, startingNumber);
        }
        for(int i = 1; i < 10; ++i){
            if(++startingNumber == 10) {startingNumber = 1;}
            if
        }
    return false;
    }
    public boolean validator(){

        return true;
    }
}
