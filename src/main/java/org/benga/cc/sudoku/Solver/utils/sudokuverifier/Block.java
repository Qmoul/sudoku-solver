package org.benga.cc.sudoku.Solver.utils.sudokuverifier;

import java.util.HashSet;
import java.util.Set;

public class Block implements Validator {

	private Set<int[]> units = new HashSet<>();

	public Block(int[][] input, int boardSize, int blockSize) {
		for(int i = 0; i < boardSize; i += blockSize)
			for(int j = 0; j < boardSize; j += blockSize) {
				int[] block = new int[boardSize];
				for(int k = 0; k < blockSize; k++)
					for(int l = 0; l < blockSize; l++) {
						block[k*blockSize+l] = input[(i + k)][(j + l)];
						units.add(block);
					}
			}
	}

	@Override
	public boolean getValid() {
		return SudokuHelper.verify(units);
	}
}
