package org.eric.ds.ch08.fallingBall;

public class FallingBall {

	private FallingBall() {
		throw new AssertionError("Can't be instantiated");
	}
	
	public static void computePath(int prevElevation, int i, int j, 
			int rows, int cols, int[][] elevations) {
		
		if(elevations == null)
			throw new IllegalArgumentException("Elevations can't be null");
		
		// we ensure that ball is still in the grid
		if (i >=0 && i < rows && j >= 0 && j < cols) {
			
			int currentElevation = elevations[i][j];
			// we check if ball can fall from previous cell to this cell
			if (prevElevation >= currentElevation && currentElevation > 0) {
				
				// we stored the current location because it will be used as 
				// prevLocation for next step
				prevElevation = currentElevation;
				
				// mark this location as visited
				elevations[i][j] = 0;
				
				// now try to move ball in all directions
				computePath(prevElevation, i, j -1, rows, cols, elevations);
				computePath(prevElevation, i -1, j, rows, cols, elevations);
				computePath(prevElevation, i, j + 1, rows, cols, elevations);
				computePath(prevElevation, i + 1, j, rows, cols, elevations);
					
			}
		}
	}
}
