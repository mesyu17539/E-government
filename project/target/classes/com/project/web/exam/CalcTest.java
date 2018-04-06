package com.project.web.exam;

import static org.junit.Assert.*;

import org.junit.Test;

import com.project.web.exam.Calc;

public class CalcTest extends Calc {

	@Test
	public void testAdd() {
		Calc c = new Calc();
		c.setVal();
		assertEquals(10, c.add(5));
	}

	@Test
	public void testMinus() {
		Calc c = new Calc();
		c.setVal();
		assertEquals(0, c.minus(5));
	}

	@Test
	public void testMultiply() {
		Calc c = new Calc();
		c.setVal();
		assertEquals(25, c.multiply(5));
	}

	@Test
	public void testDivide() {
		Calc c = new Calc();
		c.setVal();
		assertEquals(1, c.divide(5));
	}

}
