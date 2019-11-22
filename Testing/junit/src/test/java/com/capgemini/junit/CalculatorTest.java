package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator c = null;
	
	@BeforeEach
	public void createObject() {
		c=new Calculator();
	}
	
	@Test
	public void addTest() {
		int i = c.add(-10, 5);
		
		assertEquals(-5, i);
	}//End of addTest()
	
	@Test
	public void subTest() {
		int i = c.sub(10, 5);
		
		assertEquals(5, i);
	}//End of subTest()
	
	@Test
	public void mulTest() {
		int i = c.mul(10, 5);
		
		assertEquals(50, i);
	}//End of mulTest()

	
	@Test
	public void divTest() {
		int i = c.div(10, 5);
		
		assertEquals(2, i);
	}//End of divTest()
	
	
	@Test
	public void testDivByZero() {
		Calculator c = new Calculator();
		assertThrows(ArithmeticException.class,()->c.div(10, 0));
	}//End of testDivByZero() 
	
	
	@Test
	public void factTestForNumber() {
		int i = c.fact(5);
		assertEquals(120, i);		
	}//End of factTestForNumber()
	
	
	@Test
	public void factTestForZero() {
		int i = c.fact(0);
		assertEquals(1, i);		
	}//End of factTestForZero()
	
	
	@Test
	public void factTestForNegative() {
		Calculator c = new Calculator();
		int i = c.fact(-5);
		assertEquals(1, i);		
	}//End of factTestForNegative()
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
