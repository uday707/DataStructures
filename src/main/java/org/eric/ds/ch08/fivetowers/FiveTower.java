package org.eric.ds.ch08.fivetowers;

import java.util.Set;

public class FiveTower {

	private FiveTower() {
		throw new AssertionError("Cann't be instantiated");
	}
	
	private static final int GRID_SIZE = 5;
	
	public static void buildTower(int row, Integer[] columns, Set<Integer[]> solutions) {
		if (row < 0)
			throw new IllegalArgumentException("row cann't be negative");
		
		if (columns == null || columns.length != GRID_SIZE) {
			throw new IllegalArgumentException("The columns array length must be " + GRID_SIZE);
		}
		
		if (solutions == null)
			throw new IllegalArgumentException("Solutions array can't be null");
		
		if (row == GRID_SIZE) {
			solutions.add(columns.clone());
		}else {
			for (int col =0; col < GRID_SIZE; col++) {
				if (canBuild(columns, row, col)) {
					
					// build this tower
					columns[row] = col;
					
					// go to next row
					buildTower(row + 1, columns, solutions);
				}
					
			}
		}
	}
	
	public static boolean canBuild(Integer[] columns, int row, int nextColumn) {
		// Checking for all previous rows
		for (int currentRow =0; currentRow < row; currentRow++) {
			int currentColumn = columns[currentRow];
			// can't build on same column
			if (currentColumn == nextColumn) {
				return false;
			}
			
			int columnDistence = Math.abs(currentColumn - nextColumn);
			int rowDistence = row  - currentRow;
			
			// can't build on same diagonal
			if (columnDistence == rowDistence)
				return false;
		}
		
		return true;
	}
}