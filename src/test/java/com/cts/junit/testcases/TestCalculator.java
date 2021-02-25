package com.cts.junit.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
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
		fail("Not yet implemented");
	}
	
	@Test
	public void testDollarToRupee2() {
		fail("Not yet implemented");
	}

}
