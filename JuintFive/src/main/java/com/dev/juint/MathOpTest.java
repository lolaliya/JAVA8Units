package com.dev.juint;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathOpTest {

	int actual;
	int expected;

	MathOp mo = new MathOp(); 

	@Test
	@DisplayName("Addition")
	void test1() {
		expected = 50;
		actual = mo.add(25, 25);
		assertEquals(expected, actual);
	}

}
