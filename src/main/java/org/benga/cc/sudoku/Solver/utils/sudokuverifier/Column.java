package org.benga.cc.sudoku.Solver.utils.sudokuverifier;

import java.util.HashSet;
import java.util.Set;

public class Column implements Validator {

	private Set<int[]> units = new HashSet<>();

	public Column(int[][] input, int boardSize) {
		for(int i = 0; i < boardSize; i++) {
			int[] column = new int[boardSize];
			for(int j = 0; j < boardSize; j++) {
				column[j] = input[j][i];
			}
			units.add(column);
		}
	}

	@Override
	public boolean getValid() {
		return SudokuHelper.verify(units);
	}
}
