package org.eric.ds.ch08.knightTour;

import org.eric.ds.util.DSUtils;

public class KnightTour {

	private final int n;
	
	public KnightTour(int n) {
		if (n <  1)
			throw new IllegalArgumentException("Grid must be bigger than " + n + " x " + n);
		this.n = n;
	}
	
	// all 8 the possible movements of a knight
	public static final int COL[] = {1, 2, 2, 1, -1, -2, -2, -1, 1};
	public static final int ROW[] = {2, 1, -1, -2, -2, -1, 1, 2, 2};
	
	public void knightTour(int row, int col, int cell, int[][] visited) {
		if (row < 0 || col < 0 || cell < 0)
			throw new IllegalArgumentException("The row, col & cell value cann't be less than zero");
		
		if (visited == null)
			throw new IllegalArgumentException("The visited 2D cann't be null");
		
		// mark the current cell as visited
		visited[row][col] = cell;
		
		// we have a solution
		if (cell >= n * n) {
			DSUtils.print(visited);
			// backtrack before returning
			visited[row][col] = 0;
			return;
		}
		
		// check for all possible movements (8) and recur for each valid movement
		for (int i = 0; i < (ROW.length -1); i++) {
			int newR = row + ROW[i];
			int newC = col + COL[i];
			
			// check if the new position is valid Un-Visited
			if (isValid(newR, newC) && visited[newR][newC] == 0) {
				knightTour(newR, newC, cell +1, visited);
			}
		}
		
		// if reached here, then this cell is not valid,
		// we have to back-track from here
		visited[row][col] = 0;
	}

	
	private boolean isValid(int row, int col) {
		return !( row < 0 || col < 0 || row >=n || col >= n);
	}
}
