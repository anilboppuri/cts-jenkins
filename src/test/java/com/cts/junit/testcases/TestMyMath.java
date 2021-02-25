package com.cts.junit.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cts.junit.day1.MyMath;

import junit.framework.Assert.*;

public class TestMyMath {

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		
		MyMath obj = new MyMath();
		int a =10;
		int b = 20;
		
		int expected = 30;
		int actual = obj.add(a,b);
		assertEquals(expected, actual);
		
		
		
	}
	@Test
	public void testAddNonZero() {
		//fail("Not yet implemented");
		
		MyMath obj = new MyMath();
		int a =10;
		int b = 20;
		
		int expected = 30;
		int actual = obj.add(a,b);
	//	boolean expectedResult= expected - actual == 0;
		assertEquals(expected,actual);
		
		
		
	}
	
	

}
