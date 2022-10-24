package org.eric.ds.ch10.extractIntegers;

import java.util.List;
import java.util.ArrayList;

public class Strings {

	private Strings() {
		throw new AssertionError("Cann't be instantaiated");
	}
	
	public static List<Integer> extract(String str) {
		if(str == null)
			throw new IllegalArgumentException("Input string cann't be null");
		
		List<Integer> result = new ArrayList<>();
		StringBuilder temp = new StringBuilder(String.valueOf(Integer.MAX_VALUE).length());
		
		for (int i =0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				temp.append(ch);
			}else {
				if (temp.length() > 0) {
					Integer value  = Integer.valueOf(temp.toString());
					result.add(value);
					temp.delete(0, temp.length());
				}
			}
		}
		
		return result;
	}
}
