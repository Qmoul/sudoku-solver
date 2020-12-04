package org.benga.cc.sudoku.Solver;

import org.benga.cc.sudoku.Solver.sudokuSolver.SudokuSolver;
import org.benga.cc.sudoku.Solver.utils.SudokuUtils;
import org.benga.cc.sudoku.Solver.utils.SudokuVerifier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolverTest {

    public static String testInput = "0 2 0 6 0 8 0 0 0 | 5 8 0 0 0 9 7 0 0 | 0 0 0 0 4 0 0 0 0 | 3 7 0 0 0 0 5 0 0 | 6 0 0 0 0 0 0 0 4 | 0 0 8 0 0 0 0 1 3 | 0 0 0 0 2 0 0 0 0 | 0 0 9 8 0 0 0 3 6 | 0 0 0 3 0 6 0 9 0";

    public static String testResult = "1 2 3 6 7 8 9 4 5 | 5 8 4 2 3 9 7 6 1 | 9 6 7 1 4 5 3 2 8 | 3 7 2 4 6 1 5 8 9 | 6 9 1 5 8 3 2 7 4 | 4 5 8 7 9 2 6 1 3 | 8 3 6 9 2 4 1 5 7 | 2 1 9 8 5 7 4 3 6 | 7 4 5 3 1 6 8 9 2";

    @Test
    void verificationTest(){
        SudokuVerifier verifier = new SudokuVerifier();
        Assertions.assertTrue(verifier.verify(testResult));
    }

    /*@Test
    void solveTest(){
        SudokuSolver solver = new SudokuSolver(SudokuUtils.toMatrix(testInput));
        Assertions.assertEquals(testResult, solver.getSolvedMatrix(testInput));
    }*/

    @Test
    void toStringTest(){
        Assertions.assertEquals(testResult, SudokuUtils.toSudokuString(SudokuUtils.toMatrix(testResult)));
    }
}
