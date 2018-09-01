package com.capgemini.day7.domain.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.BasicDateFormat;

class BasicDateFormatTest {

	@Test
	void testbasic() {

		//Date d1 = new Date(19970602);
		String date="02061997";
		assertEquals("02/06/1997", BasicDateFormat.convert1(date));
		
	}
	
	@Test
	void testformat() {

		//Date d1 = new Date(19970602);
		String date="02061997";
		assertEquals("02 jun,1997", BasicDateFormat.convert2(date));
		
	}
}
