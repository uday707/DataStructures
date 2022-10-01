package org.eric.ds.ch08.josephus;

public class Main {

	public static void main(String[] args) {
		int saved = Josephus.josephus(15, 3);
		System.out.println(saved);

		// using the queue method
		System.out.println(Josephus.printJosephus(15, 3));
	}

}
