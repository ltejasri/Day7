package com.capgemini.day7.domain.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.Linecount;

class LineCountTestt {

	@Test
	void test() throws IOException
	{
		Linecount l1=new Linecount();
		
		assertEquals(6, l1.countlinesInFile("C:\\Users\\ltejasri\\Desktop\\teju2.txt"));
	}

}
