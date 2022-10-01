package org.eric.ds.ch10.countDistinctAbsSortedArray;

public class Arrays {

	private Arrays() {
		throw new AssertionError("Can't be instantiated");
	}
	
	public static int findAbsoluteDistinct(int[] array) {
		if (array == null)
			return -1;
		
		int count = array.length;
		int left = 0;
		int right = array.length -1;
		
		while(right > left) {
			
			// remove duplicate elements from left and right
			while(left < right && array[left] == array[left +1]) {
				count--;
				left++;
			}
				
			while(right > left && array[right] == array[right -1]) {
				count--;
				right--;
			}
			
			// if only one element left
			if(left == right)
				break;
			
			int sum = array[left] + array[right];
			// decrease the distinct count if zero sum pair is encountered
			if(sum == 0) {
				count--;
				
				left++;
				right--;
			}else if(sum < 0) {
				left++;
			}else {
				right--;
			}
		}// end of while loop.
		
		return count;
	}
}
