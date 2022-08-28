package org.eric.ds.arrays;

import org.eric.ds.arrays.MaximumOfSubarrayOfSizeK;
import org.junit.Before;
import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MaximumOfSubarrayOfSizeKTest {

	private static final Logger logger = LoggerFactory.getLogger(MaximumOfSubarrayOfSizeKTest.class);
	private MaximumOfSubarrayOfSizeK msa;
	
	@Before
	public void setUp() {
		msa = new MaximumOfSubarrayOfSizeK();
	}
	
	@Test
	public void testForPositiveSubArrayK() {
	   logger.info("Testing for positive values");
	   int input[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
	   int max[] = msa.maxSubArray(input, 4);
	}
}
