package org.eric.ds.ch08.robotGrid;

import java.awt.Point;
import java.util.Set;

public final class RobotGrid {

	// Plain recursion
	// we go recursively from [m, n] (top-left corner) and try to reach [0, 0] (bottom-right corner)
	public static boolean computePath(int m, int n, boolean[][] maze, Set<Point> path) {
		
		if (path == null || maze == null)
           throw new IllegalArgumentException("path and maze can't be null");
		
		// we fell off the grid so return
		if (m < 0 || n < 0)
			return false;
		
		// we can't step in this cell
		if(maze[m][n])
			return false;
		
		if ((m == 0 && n == 0) // we have reached our target (this bottom-right corner)
				|| (computePath(m -1, n, maze, path)) // checking in right direction
				|| (computePath(m, n - 1, maze, path))) { // checking in the bottom direction
			
			path.add(new Point(m, n));
			
			return true;
					
		}
		
		return false;
	}
}