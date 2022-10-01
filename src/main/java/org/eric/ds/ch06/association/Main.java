package org.eric.ds.ch06.association;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		Person p1 = new Person("Andrei");
		Person p2 = new Person("Marin");

		Address a1 = new Address("Benesti", "107050");
		Address a2 = new Address("Becuresti", "229344");

		// Association between the classes in the main method
		logger.info("{} lives at address {}, {} but it also has a address at {}, {}"
				, p1.getName(), a2.getCity(), a2.getZip(), a1.getCity(), a1.getZip());

		logger.info("{} lives at address {}, {} but it also has a address at {}, {}",
				p2.getName(), a1.getCity(), a1.getZip(), a2.getCity(), a2.getZip());

	}
}
