package org.eric.ds.bits;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CountBits {

	private static final Logger logger = LoggerFactory.getLogger(CountBits.class);
	
	private int[] count = new int[256];
	
	public CountBits() {
	  preCalculate();	
	}
	
	private int countBits(int num) {
		int n  = 0;
		while(num != 0) {
			 num &= num -1;
			 n++;
		}
		return n;
	}
	
	void preCalculate() {
		for(int i = 0; i < count.length; i++) {
	       count[i] = countBits(i);		
		}
	}
	
	public int countBitsFaster(int num) {
	   int total = 0;
	   int mask = (1<<8) -1;
	   for (int i =0; i < 4; i++) {
		   total += count[num & mask];
		   num = num >>> 8;
	   }
	   return total;
	}
	
	public static void main(String[] args) {
	   CountBits cb = new CountBits();
	   logger.info("Number of bits is: {}", cb.countBits(6336363));
	   logger.info("Number of bits: {}, with countsBitsFaster method", cb.countBitsFaster(6336363));
	}

}
