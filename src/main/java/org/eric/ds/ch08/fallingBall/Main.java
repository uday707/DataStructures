package org.eric.ds.ch08.fallingBall;

import org.eric.ds.util.DSUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;

public class Main {

	private final static Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
	
		int cols = 5;
		int rows = 5;
		int elevation = 5; // a cell can have the elevation 1, 2, 3, 4 or 5 (the highest)
		
		int[][] elevations = new int[rows][cols];
		
		// fill the elevation with random values
		DSUtils.fill2DArray(elevations, elevation);
		
		// show the grid on screen
		DSUtils.print(elevations);
		
		logger.info("middle cell has elevation: {}", elevations[rows/2][cols/2]);
		
		// now starting from middle element
		FallingBall.computePath(elevations[rows/2][cols/2], rows/2, cols/2, rows, cols, elevations);
		
		// final resultant grid is given as below
		logger.info("Result grid: ");
		DSUtils.print(elevations);
		
		
	}

}
