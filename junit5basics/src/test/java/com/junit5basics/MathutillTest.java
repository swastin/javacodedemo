package com.junit5basics;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathutillTest {
	Mathutill mu;

	@BeforeEach
	void init() {
		mu = new Mathutill();

	}

	@Test
	@DisplayName("Add function test")
	void testAdd() {

		int expected = 2;
		int acttual = mu.add(1, 1);
		assertEquals(expected, acttual);
	}

	@Test
	@EnabledOnOs(OS.LINUX)
	void testSub() {
		int expected = 0;
		int acttual = mu.sub(1, 1);
		assertEquals(expected, acttual);
	}

//
	@Test
	void testMul() {
		assumeTrue(true);
		int expected = 2;
		int acttual = mu.mul(2, 1);
		assertEquals(expected, acttual);
	}

//
	@Test
	void testDiv() {
		float expected = (float) 2.0;
		int acttual = mu.div(2, 1);
		assertEquals(expected, acttual);
		assertThrows(ArithmeticException.class, () -> mu.div(2, 0), "Exception happned");

	}

	@Test
	void testMultiply() {

		assertAll(() -> assertEquals(4, mu.mul(2, 2)), () -> assertEquals(0, mu.mul(2, 0)),
				() -> assertEquals(-4, mu.mul(-2, 2)));

	}

	@AfterEach
	void cleanup() {

		System.out.println("Cleaning up");
	}

}
