package org.eric.ds.ch01;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Before;


import static org.junit.Assert.assertNull;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class BubbleSortTest {
	
	private static int[] arr;
	private int[] singleValArr;
	
	@BeforeClass
	public static void initilizeArray() {		
		arr = new int[] {7,4,2,3,9,6,1,5}; 		
	}

	@AfterClass
	public static void destoryArray() {
		arr = null;
	}
	
	@Test(expected = NullPointerException.class)
	public void testArrForNull() {
		
		int [] arrNull = BubbleSort.sort(null);
		//assertNull(arrNull);
	}
	
	@Before
	public void initSingleValueArr() {
		singleValArr = new int[] {2};
	}

	@Test
	public void testGivenArray() {
		assertEquals(singleValArr, BubbleSort.sort(singleValArr));
		int[] arr1 = BubbleSort.sort(arr);
		System.out.println(Arrays.toString(arr1));
		for(int i =0;i<arr1.length-1;i++)
			assertTrue(arr1[i] < arr[i+1]);
	}
}
