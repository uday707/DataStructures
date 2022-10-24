package org.eric.ds.ch10.findPairsSumEqualK;

import java.util.List;
import java.util.ArrayList;

public class Arrays {

	private Arrays() {
		throw new AssertionError("Cann't be instantiazed");
	}
	
	public static List<String> pairs(int[] arr, int sum) {
		
		if (arr == null)
			throw new IllegalArgumentException("Input array cann't be null");
		
		List<String> result = new ArrayList<>();
		
		// first sorting the array O(nlogn) 
		java.util.Arrays.sort(arr);
		int l = 0;
		int r = arr.length -1;
		// creating sliding window to 
		while(l < r) {
			int s  = arr[l] + arr[r];
			// if intermediate sum is equal to sum, the required pair found,
			// then move both pointers to each other.
			if(s == sum) {
				String res = "(" + arr[l] + " + " + arr[r] + ")";
				result.add(res);
				l++;
				r--;
			}
			// if intermediate s is less than sum, then move left pointer to right
			else if (s < sum) {
				l++;
			}
			// if intermediate s is more than sum, then move right pointer to left
			else if(s > sum) {
				r--;
			}
		}
		
		return result;
	}
}
