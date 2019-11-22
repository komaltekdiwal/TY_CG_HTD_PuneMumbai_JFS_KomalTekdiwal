package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	public void testAdd() {
		Sum s = new Sum();
		int i = s.add(10, 5);
		
		assertEquals(15, i);
	}//End of testAdd()
	
	
	@Test
	public void testAdd1() {
		Sum s = new Sum();
		int i = s.add1(10, 10, 10);
		
		assertEquals(30,i);
	}//End of testAdd1()
}//End of class
