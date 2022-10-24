package org.eric.ds.ch08.coins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		logger.info("Plain Recursion start: ");
		logger.info("Coins (plain recursion): {}", Coins.calculateChange(20000));
		logger.info("Plain Recursion end: ");
		logger.info("Coins (Memo recursion): {}", Coins.calculateChangeMemo(5));
	}

}
