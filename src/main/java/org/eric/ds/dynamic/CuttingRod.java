package org.eric.ds.dynamic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CuttingRod {

	private static final Logger logger = LoggerFactory.getLogger(CuttingRod.class);
	
	public int maxValue(int price[]) {
		// Creating the max integer array to store the max
		// values for each cutting length for each cut
		int max[] = new int[price.length + 1];
		// iterating over each length of rod for possible options
		// with another size to get profit and storing the max 
		// profit from each options
		for (int i = 1; i <= price.length; i++)
			for (int j = i; j <= price.length; j++) {
				max[j] = Math.max(max[j], max[j-1] + price[i -1]);
			}
		
		return max[price.length];
	}

	public int maxValue2(int price[]) {
	   int max[] = new int [price.length + 1];
	   // Pre-filling the max array with price value earlier
	   // with price values
	   for (int i = 1; i <= price.length; i++)
		   max[i] = price[i -1];
	   
	   // Iterating over the price values for each cut size
	   for (int i =1; i <= price.length; i++) {
		   // Checking the already filled max array with previous 
		   // price values from j =1 to current position of i.
		   for (int j =1; j < i; j++) {
			   max[i] = Math.max(max[i], max[i-j] + max[j]);
		   }
	   }
	   
	   return max[price.length];
	}
	
	// Naive recursive method
	public int maxValueRecursive(int[] price, int len) {
	   	if (len <= 0)
	   		return 0;
	   	
	   	int maxValue = 0;
	   	// Iterating over each price to check whether max value is 
	   	// current max value is greater than current price
	   	for (int i =0; i < len; i++) {
	   		int val = price[i] + maxValueRecursive(price, len -i -1);
	   		if (val > maxValue)
	   			maxValue = val;
	   	}
	   	return maxValue;
	}
	
	public static void main(String[] args) {
	   CuttingRod rod = new CuttingRod();
	   int price[] = {3,5,8,9,10,20,22,25};
	   int maxValue1 = rod.maxValue(price);
	   logger.info("price size maxValue 1: {}", maxValue1);
	   
	   int maxValue2 = rod.maxValue2(price);
	   logger.info("price size maxValue 1: {}", maxValue2);
	   
	   int maxValueRecursive = rod.maxValueRecursive(price, price.length);
	   logger.info("price size maxValue Recursive: {}", maxValueRecursive);
	}

}
