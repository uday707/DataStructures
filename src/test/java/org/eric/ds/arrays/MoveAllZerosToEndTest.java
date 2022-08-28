package org.eric.ds.arrays;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoveAllZerosToEndTest {

	private static final Logger logger = LoggerFactory.getLogger(MoveAllZerosToEndTest.class);
	private MoveAllZerosToEnd maz;
	
	@Before
	public void setUp() {
		maz = new MoveAllZerosToEnd();
	}
	
	@Test
	public void testMoveAllZeros() {
		 int arr[] = {0,0,1,2,0,5,6,7,0};
		 maz.moveZeros(arr);
		 logger.info("Array after moving zeros to right: {}", arr);
	}
	
	@Test
	public void testForAllZerosInArray() {
		int arr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0};
		maz.moveZeros(arr);
		logger.info("With All Zeros array, after execution: {}", arr);
	}
	
	
}
