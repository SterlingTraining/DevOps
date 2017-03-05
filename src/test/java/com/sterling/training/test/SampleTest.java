package com.sterling.training.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import com.sterling.training.util.CalcInterface;
import com.sterling.training.util.Calculator;

public class SampleTest {
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(SampleTest.class);
	private static CalcInterface calculator;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calculator = new Calculator();
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
	public void testSum() {
		int res = calculator.sum(9, 12);
		assertEquals(21, res);
	}
	
	@Test
	public void testMultiply() {
		int res = calculator.multiplication(2, 6);
		assertEquals(12, res);
	}

	@Test
	public void testDivison() {
		try {
			int result = calculator.divison(10, 2);

			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.divison(10, 0);
	}

	@Ignore
	@Test
	public void testEqual() {
		boolean result = calculator.equalIntegers(20, 20);

		assertFalse(result);
	}
//added comment
	@Ignore
	@Test
	public void testSubstraction() {
		int result = 10 - 3;

		assertTrue(result == 7);
	}

}
