package org.eric.ds.dp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  An implementation of edit distance
 * @author Uday Singh
 *
 */
public class EditDistanceIterative {

	private static final Logger logger = LoggerFactory.getLogger(EditDistanceIterative.class);
	// Compute cost to convert a string 'a' into a string 'b' using dynamic
	// programming given the insertionCost, deletionCost and substitutionCost, 0(nm)
	public static int editDistance(
			String a, String b, int insertionCost, int deletionCost, int substitutionCost) {
		final int AL = a.length(), BL = b.length();
		int dp[][] = new int[AL +1] [BL + 1];
		
		for (int i =0; i <= AL; i++) {
			for (int j = (i == 0 ? 1:0); j <= BL; j++ ) {
			     int min  = Integer.MAX_VALUE;
			     
			     //substitution
			     if (i > 0 && j > 0)
			    	 min = dp[i -1][j -1] + (a.charAt(i -1) == b.charAt(j -1) ? 0:substitutionCost); 
			     
			     //deletion
			     if (i > 0)
			    	min = Math.min(min, dp[i-1][j] + deletionCost);
			     
			     // Insertion
			     if ( j > 0)
			    	 min = Math.min(min, dp[i][j -1] + insertionCost);
			     
			     dp[i][j] = min;
			}
			
		}
		return dp[AL][BL];
	}
	
	public static void main(String[] args) {
		String a = "abcdefg";
		String b = "abcdefg";
		
		// These strings are equal hence the cost is zero
		logger.info("Cost: {}", EditDistanceIterative.editDistance(a, b, 10, 10, 10));
		
		a = "aaa";
		b = "aaabbb";
		// Cost is 10*3 = 30 as there are 3 insertions
		logger.info("Cost: {}", EditDistanceIterative.editDistance(a, b, 10, 2, 3));
		
		a = "1023";
		b = "10101010";
		
		// cost is 2*2 + 4*5 = 24, 2 substitutions & 4 insertions
		logger.info("Cost: {}", EditDistanceIterative.editDistance(a, b, 5, 7, 2));
		
		a = "98765433";
		b = "12345";
		// cost is 4 * 4 = 16, 4 deletions
		logger.info("Cost: {}",  EditDistanceIterative.editDistance(a, b, 2,4,1));
	}
}
