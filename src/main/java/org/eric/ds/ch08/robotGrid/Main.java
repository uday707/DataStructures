package org.eric.ds.ch08.robotGrid;
import java.awt.Point;
import java.util.Set;
import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {
		  /* 0 - robot, # - maze, X - target
		 (m, n) +           +
		        |0| | | | | |
		        |0|0| | | | |
		        |#|0|0|0|0| | 
		        |#|#|#|#|0| |        
		        | | | | |0| | 
		        | | | | |0|X|
		        +           + (0, 0)
		        */       
		Set<Point> path = new LinkedHashSet<>();
		boolean[][] maze = new boolean[6][6];
		maze[2][0] = true;
		maze[3][0] = true;
		maze[3][1] = true;
		maze[3][2] = true;
		maze[3][3] = true;
		
		RobotGrid.computePath(5, 5, maze, path);
		System.out.println("Computed path (plain recursion):");
		path.forEach(System.out::println);
		
	}
}
