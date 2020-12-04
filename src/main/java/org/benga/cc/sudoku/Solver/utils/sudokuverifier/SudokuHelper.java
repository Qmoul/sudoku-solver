package org.benga.cc.sudoku.Solver.utils.sudokuverifier;

import org.benga.cc.sudoku.Solver.utils.SudokuUtils;

import java.util.Arrays;
import java.util.Set;

public class SudokuHelper {

    public static boolean verify(Set<int[]> input){
        return input.parallelStream().filter(block -> {
            Arrays.sort(block);
            return !Arrays.equals(block, SudokuUtils.EXPECTED);
        }).findFirst().isEmpty();
    }
}
