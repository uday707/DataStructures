package org.eric.ds.ch01;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.util.logging.Logger;

public class TestAnnotation {
	
	private static Logger logger = Logger.getLogger(TestAnnotation.class.getName());
	//execute before the start of class
	@BeforeClass
	public static void beforeClass() {
			logger.info("in the before class");
	}

	//Execute the after class
	@AfterClass
	public static void afterClass() {
		logger.info("in after class");
	}
	
	//execute before each test case
	@Before
	public void before() {
		logger.info("in before");
	}
	
	//execute after each test case
	@After
	public void after() {
		logger.info("in after");
	}
	
	@Test
	public void testFirstCase() {
	    logger.info("In Test Case");
	    assertSame(10, Integer.valueOf(10));
	    assertNotEquals(10, 1);
	    assertNotNull(10);
	}
	public void caller() {
		logger.info("inside the caller mrthod");
		logger.info("Leaving the caller Method");
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSecondTestCase() {
		logger.info("In Second Test Case");
		caller();
		//logger.info("Caller Method is called");
		//assertNull(null);
		throw new IllegalArgumentException();
	}
}
