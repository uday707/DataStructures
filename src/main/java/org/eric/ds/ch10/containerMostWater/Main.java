package org.eric.ds.ch10.containerMostWater;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		int[] heights = {1,4,6,2,7,3,8,5,3};
		int area  = Container.maxArea(heights);
		logger.info("Max Area: {}", area);
		area = Container.maxAreaOptimized(heights);
		logger.info("Max Area Optimzied: {}", area);
	}

}
