package org.eric.ds.arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaximumOfSubarrayOfSizeK {

	public int[] maxSubArray(int input[], int k) {
		Deque<Integer> queue = new LinkedList<>();
		int max[] = new int[input.length -k +1];
		int maxVal = Integer.MIN_VALUE;
		
		//first find max of first k values and make it 0th element in max array
		for(int i = 0; i < k; i++) {
			if (maxVal < input[i])
				maxVal = input[i];
			
			if (queue.isEmpty())
				queue.offerFirst(i);
			else {
				while(!queue.isEmpty() && input[queue.peekLast()] <= input[i]) {
					queue.pollLast();
				}
				queue.offerLast(i);
			}
		}
		
		max[0] = maxVal;
		int index = 1;
		// continue from k till last element
		for (int i = k; i < input.length; i++) {
			//if the index of peek is k distance from i then its no value to us.
			// throw it away
			if (i - k + 1 > queue.peekFirst()) {
				queue.pollFirst();
			}
			while(!queue.isEmpty() && input[queue.peekLast()] <= input[i]) {
				queue.pollLast();
			}
			queue.offerLast(i);
			//only reason first element survived was because it was biggest element.
			// make this the max value of this k
			max[index] = input[queue.peekFirst()];
			index++;
		}
		return max;
	}
}
