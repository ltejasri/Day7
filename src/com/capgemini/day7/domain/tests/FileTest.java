package com.capgemini.day7.domain.tests;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileTest
{
	@Test
	void testFile()
	{
	File file = new File("C:\\ltejasri");
	assertEquals(true, file.exists());
	}

	

}

