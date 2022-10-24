package org.eric.ds.ch10.extractIntegers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
	   String str = "cv dd 4 k 2321 2 11 k4k2 66 4d";
	   logger.info("Integer in string are: {}", Strings.extract(str));
		
	}

}
