package org.eric.ds.ch08.brightestSpot;

public final class BrightestColorSpot {

	private int currentColorSpot;
	
	/**
	 *  Method to determine the brightest spot on current screen with highest number 
	 *  of positions, we just need the calculate the number of positions of given color
	 *  in list of available colors.
	 * @param rows 
	 *        number of rows in given screen array
	 * @param cols
	 *        number of columns in given screen array
	 * @param a 
	 *        input array screen 
	 */
	public void determineBrightestColorSpot(int rows, int cols, int[][] a) {
		
		if (a == null)
			throw new IllegalArgumentException("Array can't be null");
		
		if (rows <= 0 || cols <= 0)
			throw new IllegalArgumentException("Grid can't have 0 rows and columns");
		
		int brightestColorSpot = 0;
		int color = 0;
		
		for (int i =0; i < rows; i++)
			for (int j = 0; j < cols; j++) {
				if (a[i][j] > 0) {
					currentColorSpot = 0;
					
					computeColorSpot(i, j, rows, cols, a, a[i][j]);
					if(currentColorSpot > brightestColorSpot) {
						brightestColorSpot = currentColorSpot;
					    color = a[i][j] * (-1);
					}
				}
			}
		
		System.out.println("\nColor: " + color + " Brightest Spot: " + brightestColorSpot);
	}
	
	private void computeColorSpot(int i, int j, int rows, int cols, int a[][], int color) {
		
		// Setting the current spot with color value as visited with negative value.
		a[i][j] = -a[i][j];
		
		// increasing the given color count by one in every recursion.
		currentColorSpot++;
		
		// recursively comparing the current color 
		if (i > 0 && a[i -1][j] == color)
			computeColorSpot(i-1, j, rows, cols, a, color);
		
		if ((i +1) < rows && a[i+1][j] == color) 
			computeColorSpot(i+1, j, rows, cols, a, color);
		
		if (j > 0 && a[i][j -1] == color)
			computeColorSpot(i, j -1, rows, cols, a, color);
		
		if ((j +1) < cols && a[i][j +1] == color) 
			computeColorSpot(i, j+1, rows, cols, a, color);
		
		
             
	}
	
}
