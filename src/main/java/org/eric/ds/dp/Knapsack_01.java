package org.eric.ds.dp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Knapsack_01 {

	private static final Logger logger = LoggerFactory.getLogger(Knapsack_01.class);
	/**
	 * 
	 * @param capacity - the maximum capacity of the knapsack
	 * @param W - the weights of items
	 * @param V - the values of the items
	 * @return The maximum achievable profit of selecting a subset of the elements 
	 *    such that capacity of the knapsack is not exceeded.
	 */
	public static int knapsack(int capacity, int[] W, int[] V) {
		if (W == null || V == null || W.length != V.length || capacity < 0)
			throw new IllegalArgumentException("Invalid Input");
		
		final int N = W.length;
		// initialize the table where rows represents the items
		// and columns represent their weight of knapsack
		int[][] DP = new int[N + 1][capacity +1];
		
		for (int i = 1; i <= N; i++) {
			
			// get the value and weight of item
			int v = V[i -1], w = W[i -1];
			
			for (int sz = 1; sz <= capacity; sz++) {
				
				// Consider not picking the item
				DP[i][sz] = DP[i -1][sz];
				
				// Consider including the current element and
				// see if this would be more profitable
				if (sz >= w && DP[i -1][sz -w] + v > DP[i][sz])
					DP[i][sz] = DP[i -1][sz -w] + v;
			}
		}
		
		int sz = capacity;
		List<Integer> itemSelected = new ArrayList<>();
		
		// Using the information inside the table, we can backtrack and determine
		// which items were selected during dynamic programming phase. the idea
		// is that if DP[i][sz] != DP[i -1][sz], then item will be selected
		for (int i = N; i > 0; i--) {
			if (DP[i][sz] != DP[i -1][sz]) {
				int itemIndex = i -1;
				itemSelected.add(itemIndex);
				sz -= W[itemIndex];
			}
		}
		
		// Return the items that are selected 
		// java.util.Collections.reverse(itemSelected)
		// return itemSelected
		
		java.util.Collections.reverse(itemSelected);
		logger.info("Items selected: {}", itemSelected);
			
		// Return the maximum profit
		return DP[N][capacity];
	}
	
	public static void main(String[] args) {
		int capacity = 10;
		int V[] = {1, 4, 8 ,5};
		int W[] = {3, 3, 5, 6};
		
		logger.info("maximum profit: {}", Knapsack_01.knapsack(capacity, W, V));
		
		
		capacity = 7;
		V = new int[] {2, 2, 4, 5, 3};
		W = new int[] {3, 1, 3, 4, 2};
		logger.info("maximum profit: {}", Knapsack_01.knapsack(capacity, W, V));
	}

}
