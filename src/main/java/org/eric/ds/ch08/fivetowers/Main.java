package org.eric.ds.ch08.fivetowers;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		Set<Integer[]> solutions = new HashSet<>();
		FiveTower.buildTower(0, new Integer[5], solutions);
		logger.info("Solutions");
		for (Integer[] solution: solutions) 
			System.out.println(Arrays.toString(solution));
	}
}
