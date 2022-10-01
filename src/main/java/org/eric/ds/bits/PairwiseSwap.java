package org.eric.ds.bits;

import org.eric.ds.util.DSUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PairwiseSwap {

	private static final Logger logger = LoggerFactory.getLogger(PairwiseSwap.class);
	
	public static int swapOddEvenBits(int x) {
		return ( ((x & 0xaaaaaaaa) >>> 1) | ((x & 0x55555555) >> 1));
	}
	
	public static void main(String[] args) {
		int a = 234231;
		logger.info("a = {}", DSUtils.toFullBinaryString(a));
		int b = swapOddEvenBits(a);
		logger.info("b = {}", DSUtils.toFullBinaryString(b));
	}

}
