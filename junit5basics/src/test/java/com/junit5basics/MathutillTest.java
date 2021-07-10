/*************************
 * 
 * @author swastin
 * 
 *************************/


package com.junit5basics;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathutillTest {
	Mathutill mu;
	TestInfo testinfo;
	TestReporter testReporter;
	@BeforeEach
	void init(TestInfo testinfo,TestReporter testReporter) {
		
		this.testinfo=testinfo;
		this.testReporter=testReporter;
		mu = new Mathutill();

	}
	/***********************************
	 * 
	 * 
	 * class for test for addition function
	 * 
	 * 
	 * 
	 **************************************/
	
@Nested
@Tag("math")
	class addTest {

		@Test
		@DisplayName("Testing add method for +ve")
		void testAddpositive() {

			int expected = 2;
			int actual = mu.add(1, 1);
			assertEquals(expected, actual);
		}
		@Test
		@DisplayName("Testing add method for -ve")
		void testAddnegative() {

			int expected1 = -2;
			int actual1 = mu.add(-1, -1);
			assertEquals(expected1, actual1);
		}
	}

	@Test
	//@EnabledOnOs(OS.LINUX)
	@Tag("math")
	void testSub() {
		int expected = 0;
		int acttual = mu.sub(1, 1);
		assertEquals(expected, acttual);
	}

//
	@Test
	@Tag("math")
	void testMul() {
		assumeTrue(true);
		int expected = 2;
		int acttual = mu.mul(2, 1);
		assertEquals(expected, acttual);
	}

//
	@Test
	@Tag("math")
	void testDiv() {
		float expected = (float) 2.0;
		int acttual = mu.div(2, 1);
		assertEquals(expected, acttual);
		assertThrows(ArithmeticException.class, () -> mu.div(2, 0), "Exception happned");

	}

	@Test
	@Tag("math")
	void testMultiply() {

		assertAll(() -> assertEquals(4, mu.mul(2, 2)), () -> assertEquals(0, mu.mul(2, 0)),
				() -> assertEquals(-4, mu.mul(-2, 2)));
		
		
		System.out.print(testinfo.getDisplayName()+" "+testinfo.getTags()+testinfo.getTestClass());

	}

//	@AfterEach
//	void cleanup() {
//
//		System.out.println("Cleaning up");
//	}

}
