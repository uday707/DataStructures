package org.eric.ds.arrays;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;

public class DuplicateWithinKIndices {

	public static final Logger logger = LoggerFactory.getLogger(DuplicateWithinKIndices.class);
	public static boolean duplicate(int[] arr, int k) {
	
		Set<Integer> visited = new HashSet<>();
		
		for (int i = 0; i < arr.length; i++ ) {
			if (visited.contains(arr[i])) {
				return true;
			}
			if(i >= k) {
				visited.remove(arr[i -k]);
			}
			
			visited.add(arr[i]);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,11,2,5,6};
		logger.info("is duplicate arr exits within indices: {}", duplicate(arr, 3));
		
	}

}