package org.eric.ds.util;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DSUtils {
	
	private static final Logger logger = LoggerFactory.getLogger(DSUtils.class);
	private DSUtils() {}
	
	public static String toFullBinaryString(int a) {
		String s = "";
		for (int i = 0; i < 32; i++) {
			Integer lsb = new Integer(a & 1);
			s = lsb.toString() + s;
			a = a >> 1;
		}
		return s;
	}
	
	public static void print(int[][] array) {
		for (int[] row : array)
			print(row);
	}
	
	public static void print(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length -1; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println(array[array.length -1] + "]");
	}
	
	public static void fill2DArray(int[][] array, int limit) {
		Random random = new Random();
		for(int i =0; i < array.length; i++)
			for(int j =0; j < array[i].length; j++)
				array[i][j] = 1 + random.nextInt(limit);
		
	}
}
