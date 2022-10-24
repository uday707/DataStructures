package org.eric.ds.ch08.coins;

import org.eric.ds.util.DSUtils;

public final class Coins {

	private Coins() {
		throw new AssertionError("can'nt be instantized ...");
	}
	
	// pain recursion
	public static int calculateChange(int n) {
		
		if (n <= 0)
			return -1;
		
		int[] coins  = {25, 10, 5, 1};
		
		return calculateChange(n, coins, 0);
	}
	
	// plain recursion
	private static int calculateChange(int amount, int[] coins, int position) {
		
		if (position >= coins.length -1)
			return 1;
		
		int coin = coins[position];
		int count  = 0;
		for (int i = 0; i * coin <= amount; i++) {
			int remaining = amount - i * coin;
			count += calculateChange(remaining, coins, position + 1);
		}
		
		return count;
	}
	
	//Calculate change memoization
	public static int calculateChangeMemo(int n) {
		// input amount cann't be less than one
		if (n <= 0)
			return -1;
		
		int[] coins = {25, 10, 5, 1};
		// implementing 2D array to store the previous values
		int[][] cache = new int[n+1][coins.length];
		
		int count = calculateChangeMemo(n, coins, 0, cache);
		
		DSUtils.print(cache);
		return count;
	}
	
	public static int calculateChangeMemo(int amount, int[] coins, int position, int[][] cache) {
		
		// if the current coin value is greater than current limit 
		// then return one as count
		if (position >= coins.length - 1)
			return 1;
		
		// do'nt again the process the given position if already
		// set in cache
		if (cache[amount][position] > 0) 
			return cache[amount][position];
				
				
		int coin = coins[position];
		int count = 0;
		for (int i =0; i * coin <= amount; i++) {
			int remaining = amount - i * coin;
			count += calculateChangeMemo(remaining, coins, position + 1, cache);
		}
		
		// setting the count position in cache
		cache[amount][position] = count;
		
		return count;
	}
}
