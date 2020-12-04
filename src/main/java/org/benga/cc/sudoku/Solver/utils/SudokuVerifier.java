package org.benga.cc.sudoku.Solver.utils;

import org.benga.cc.sudoku.Solver.utils.sudokuverifier.*;
import org.benga.cc.sudoku.Solver.utils.SudokuUtils;

import java.util.HashSet;
import java.util.Set;

public class SudokuVerifier{

	public SudokuVerifier() {}

	public boolean verify(String input) {

		Set<Validator> validators = new HashSet<>();

		validators.add(new Line(SudokuUtils.toMatrix(input), SudokuUtils.BOARD_SIZE));
		validators.add(new Column(SudokuUtils.toMatrix(input), SudokuUtils.BOARD_SIZE));
		validators.add(new Block(SudokuUtils.toMatrix(input), SudokuUtils.BOARD_SIZE, SudokuUtils.BLOCK_SIZE));

		return validators.parallelStream().allMatch(Validator::getValid);
	}
}
