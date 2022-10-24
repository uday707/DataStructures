package org.eric.ds.ch10.encodedString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		String str = "India is great";
		logger.info("Encoded String: {}", String.valueOf(Strings.encodedWhiteSpaces(str.toCharArray())));
	}

}
