package org.eric.ds.ch08.brightestSpot;

import java.util.Random;

import org.eric.ds.util.DSUtils;

public class Main {

	public static void main(String[] args) {
		int cols = 5;
		int rows = 5;
		int colors = 3; // an spot can have 1, 2, 3 colors
		
		int[][] a = new int[rows][cols];
		
		DSUtils.fill2DArray(a, colors);
		
		// printing the surface of screen
		DSUtils.print(a);
		
		BrightestColorSpot spots = new BrightestColorSpot();
		spots.determineBrightestColorSpot(rows, cols, a);
	}

}
