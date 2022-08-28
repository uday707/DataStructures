package org.eric.ds.arrays;

public class MoveAllZerosToEnd {
	
	// Utility method to move all zeros to left in an array.
	public void moveZeros(int arr[]) {
	   int slow = 0;
	   int fast = 0;
	   while(fast < arr.length) {
		   if(arr[fast] == 0) {
			   fast++;
			   //jump to next hop of while loop
			   continue;
		   }
		   arr[slow] = arr[fast];
		   slow++;
		   fast++;
	   } // End of loop
	   
	   // all the non-zero elements are populated up to the 
	   // slow pointer, now fill remaining positions with zeros.
	   while(slow < arr.length)
		   arr[slow++] = 0;
	}
}
