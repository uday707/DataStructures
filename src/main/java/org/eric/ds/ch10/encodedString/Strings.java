package org.eric.ds.ch10.encodedString;

public class Strings {

	
	private Strings() {
		throw new AssertionError("Can'nt be instantiated");
	}
	
	public static char[] encodedWhiteSpaces(char[] str) {
		
		if (str == null)
			throw new IllegalArgumentException("the given string cann't be null");
		
		int countWhitespaces = 0;
		// count white-spaces (step 1)
		for (int i =0; i < str.length; i++) 
			if (Character.isWhitespace(str[i]))
				countWhitespaces++;
		
		if (countWhitespaces > 0) {
			
			// create encoded char[] (step 2)
			char[] encodedStr = new char[str.length + 2 * countWhitespaces];
			
			int index = 0;
			for(int i =0; i < str.length; i++) {
				if(Character.isWhitespace(str[i])) {
					encodedStr[index] = '%';
					encodedStr[index + 1] = '2';
					encodedStr[index + 2] = '0';
					index += 3;
				}else {
					encodedStr[index] = str[i];
					index++;
				}
			}
			return encodedStr;
		}
		return str;
	}
}
