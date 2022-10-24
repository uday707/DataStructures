package org.eric.ds.ch10.findPairsSumEqualK;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		 int sum = 10;
	     int[] arr = new int[]{-5, -2, 5, 4, 3, 7, 2, 1, -1, -2, 15, 6, 12, -4, 3};

	     List<String> result = Arrays.pairs(arr, sum);
	     
          logger.info("Resultant pairs are: {}", result);
	}

}
