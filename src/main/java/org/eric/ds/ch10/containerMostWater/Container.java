package org.eric.ds.ch10.containerMostWater;

public class Container {

	private Container() {
		throw new AssertionError("Can't be instantiated");
	}
	
	// O(n^2)
	public static int maxArea(int[] heights) {
		
		if(heights == null)
			throw new IllegalArgumentException("given height array can't be null");
		
		int maxArea = 0;
		// making every height pair to get the max area. (very bad).
		for (int i = 0; i < heights.length; i++)
			for (int j = i + 1; j < heights.length; j++) {
				// traverse every (i,j) pair
				maxArea = Math.max(maxArea, Math.min(heights[i], heights[j]) * (j -i));
			}
		return maxArea;
	}
	
	// O(n)
	public static int maxAreaOptimized(int[] heights) {
		if (heights == null)
			throw new IllegalArgumentException("given height array can't be null");
		
		int maxArea = 0;
		
		int i = 0; // left-hand side pointer
		int j = heights.length -1; // right-hand side pointer
		
	    // area can't be negative, there i should be less than j
		while(i < j) {
			
			// calculate the area for each pair of i & j
			maxArea = Math.max(maxArea, Math.min(heights[i], heights[j]) * (j -i));
			
			if (heights[i] <= heights[j])
				i++; // left pointer is less than right pointer.
			else 
				j--; // right pointer is less than left pointer.
		}
		return maxArea;
	}
}

