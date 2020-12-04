package org.benga.cc.sudoku.Solver.utils.sudokuverifier;

import java.util.HashSet;
import java.util.Set;

public class Line implements Validator {

	private Set<int[]> units = new HashSet<>();

	public Line(int[][] input, int boardSize) {
		for(int i = 0; i < boardSize; i++)
			units.add(input[i]);
	}

	@Override
	public boolean getValid() {
		return SudokuHelper.verify(units);
	}
}
