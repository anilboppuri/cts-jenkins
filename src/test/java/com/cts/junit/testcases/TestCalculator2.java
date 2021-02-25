package com.cts.junit.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.testing.callbacks.Calculator;

public class TestCalculator2 {

	static Calculator calc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHashCode() {
		double actual = calc.dollarToRupee(-200);
		double expected = -200 * 75.65;
		assertEquals(expected,actual);
	}

}
