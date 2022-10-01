package org.eric.ds.dynamic;

import org.eric.ds.util.DSUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author uday
 *        This solution assumes that 1,2,1 is different from 2,1,1 which is different from 1,1,2
 */
public class DiceThrowWays {

	private static final Logger logger = LoggerFactory.getLogger(DiceThrowWays.class);
	
	public int numOfWays(int num, int faces, int sum) {
	   int T[][] = new int[num +1][sum +1];
	   //setting base condition to set 
	   T[0][0] = 1;
	   
	   // loop for number of dices
	   for (int i = 1; i <= num; i++  ) {
		   // loop for possible values of sum 
		   for (int j =1; j <= i*faces && j <= sum; j++) {
			   if (j == i) {
				   T[i][j] = 1;
				   continue;
			   }
			   if ( j < i) {
				   continue;
			   }
			   for (int l = 1; l <= faces; l++) {
				   if(j >= l) {
					   T[i][j] += T[i-1][j-l];
				   }
			   }
		   }
	   }
	   DSUtils.print(T);
	   return T[num][sum];
	}
	
	public static void main(String[] args) {
		DiceThrowWays dt = new DiceThrowWays();
		logger.info("num of ways a sum is get with (n,f) dices thrown: {}", dt.numOfWays(2, 2, 4));
	}
}
