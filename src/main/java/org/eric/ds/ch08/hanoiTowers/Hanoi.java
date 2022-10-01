package org.eric.ds.ch08.hanoiTowers;

public final class Hanoi {

	private Hanoi() {
		throw new AssertionError("Class can't be instantiated");
	}
	
	public static void moveDisk(int n, char origin, char target, char intermediate) {
		if (n <= 0)
			return;
		
		if (n == 1) {
			System.out.println("Move disk 1 from rod: " + origin + " to rod: " + target);
		    return;
		}
		
		// move top n -1 disk from origin to intermediate, using target as intermediate
		moveDisk(n -1, origin, intermediate, target);
		
		System.out.println("Move disk " + n + " from rod: " + origin + " to rod: " + target);
		
		// move top n -1 disk from intermediate to target, using origin as intermediate
		moveDisk(n -1, intermediate, target, origin);
	}
}
