package org.eric.ds.ch01;

public class BubbleSort {
		
	private BubbleSort() {}
	
	public static int[] sort(int[] arr) {
		
		if(arr==null) throw new NullPointerException("Input Array is null");
		
		if(arr.length==1) return arr;
		
		for(int i=0;i<arr.length;i++) 
			for(int j=0;j<arr.length;j++) {
				if (arr[i] < arr[j])
					swap(arr,i,j);
			}
		return arr;
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
