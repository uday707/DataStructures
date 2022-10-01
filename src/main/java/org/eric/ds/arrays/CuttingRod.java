package org.eric.ds.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CuttingRod {

	private static final Logger logger = LoggerFactory.getLogger(CuttingRod.class);
	
	public int maxValue(int[] price) {
	   int max[] = new int[price.length+1];
	   
	   for (int i = 1; i <= price.length; i++) {
		   for (int j = i; j <= price.length; j++) {
			   max[j] = Math.max(max[j], max[j-i] + price[i -1]);
		   }
	   }
	   logger.info("max array: {}", max);
	   return max[price.length];
 	}
	
	public int maxValue1(int[] price) {
		int[] max = new int[price.length+1];
		for (int i =1; i <= price.length; i++)
			max[i] = price[i-1];
		logger.info("max array: {}", max);
		for (int i =1; i <= price.length; i++) {
			for (int j = 1; j < i; j++) {
				max[j] = Math.max(max[i], max[i - j] + max[j]);
			}
		}
		
		logger.info("max array: {}", max);
		return max[price.length];
	}
	
	public int recursiveMaxValue(int[] price, int len) {
		if (len <= 0) {
			return 0;
		}
		
		int maxValue = 0;
		for (int i =0; i < len; i++) {
			int val = price[i] + recursiveMaxValue(price, len -i -1);
			if (maxValue < val)
				maxValue = val;
		}
		return maxValue;
	}
	public static void main(String[] args) {
	   CuttingRod cc = new CuttingRod();
	   int[] price = {3,5,8,9,10,20,22,25};
	   long startTime = System.currentTimeMillis();
	   int max  = cc.recursiveMaxValue(price, 8);
	   logger.info("max value: {}", max);
	   long endTime = System.currentTimeMillis();
	}

}
