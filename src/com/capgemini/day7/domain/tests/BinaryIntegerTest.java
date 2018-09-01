package com.capgemini.day7.domain.tests;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.BinaryInteger;

class BinaryIntegerTest {

	@Test
	void testBinaryInteger() {
		File file = new File("C:\\Users\\ltejasri\\Desktop\\neeraj.txt");
		assertEquals(1,BinaryInteger.writeBinary(file));
	}

}