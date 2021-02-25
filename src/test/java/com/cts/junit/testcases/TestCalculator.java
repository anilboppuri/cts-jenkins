package com.cts.junit.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.testing.callbacks.Calculator;

public class TestCalculator {

	static Calculator calc;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 
		calc = new Calculator();
		
		System.out.println("SUBC");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	
		System.out.println("TDAC");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("SUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tdown");
	}

	@Test
	public void testDollarToRupee() {
		
		double actual = Math.round((calc.dollarToRupee(100)));
		double expected  = 7565;
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testDollarToRupee2() {
		double actual = calc.dollarToRupee(0);
		double expected = 0.0;
		assertEquals(expected, actual);
		
		
		
		
	}

}
