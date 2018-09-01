package com.capgemini.day7.domain.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.TodayDate;
class TodayDateTest {

	@Test
	void testformat() {

		assertEquals("SATURDAY,SEPTEMBER 1,2018", TodayDate.format());
	}

}
