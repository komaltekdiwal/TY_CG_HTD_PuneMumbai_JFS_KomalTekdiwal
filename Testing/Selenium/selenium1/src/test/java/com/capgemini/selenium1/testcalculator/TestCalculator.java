package com.capgemini.selenium1.testcalculator;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.selenium1.WebDriver.Calculator;

public class TestCalculator {
	@Test
public void addTest() {
	Calculator cal=new Calculator();
	int a=20;
	int b=30;
	int expected=50;
	int actual=cal.add(a, b);
	Assert.assertEquals(expected, actual);
	
	
}
	
	@Test
	public void subTest() {
		Calculator cal = new Calculator();
		int a = 30;
		int b = 10;
		int expected = 20;
		int actual = cal.sub(a, b);
		Assert.assertEquals(expected, actual);

	}
}
