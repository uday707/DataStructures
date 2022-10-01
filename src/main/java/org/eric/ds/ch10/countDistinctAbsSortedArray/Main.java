package org.eric.ds.ch10.countDistinctAbsSortedArray;

import org.eric.ds.util.DSUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		 int[] array = {-3, -3, -2, -1, -1, -1, 0, 1, 1, 1, 2, 2, 3, 5, 6, 7, 7};
         
		 logger.info("Input array: ");
		 DSUtils.print(array);
		 
		 int count = Arrays.findAbsoluteDistinct(array);
		 logger.info("distinct count: {}", count);
         
         
	}

}
