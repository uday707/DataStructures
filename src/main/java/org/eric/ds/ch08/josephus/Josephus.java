package org.eric.ds.ch08.josephus;
import java.util.Queue;
import java.util.ArrayDeque;

public final class Josephus {

	private Josephus() {
		throw new AssertionError("Class can't be instantized");
	}
	
	// plain recurive
	public static int josephus(int n, int k) {
		if(n <= 0 || k <= 0) {
			return -1;
		}
		
		if (n ==1)
			return 1;
		else {
			return (josephus(n -1, k) + k -1)%n +1;
		}
	}
	
	public static int printJosephus(int n, int k) {
		if(n <=0 || k <= 0)
			throw new IllegalArgumentException("can't accept the illegal argument");
		
		// creating a circular queue
		Queue<Integer> queue = new ArrayDeque<>();
		
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		// iterating the circular queue to kill kth element
		while(queue.size() > 1) {
			for (int i = 0; i < k; i++) {
				int eleminated = queue.poll();
			    // removing the kth element
				if (i == (k -1))
					break;
				queue.add(eleminated);
			}
		}
		
		if(queue.size() ==1)
			return queue.poll();
		else
			return -1;
	}
}
