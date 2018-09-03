package com.capgemini.day7.domain.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.PatternSearch;

class PatternSearchTest {

	@Test
	void testPatternSearch() throws FileNotFoundException, IOException {
		File file = new File("C:\\Users\\ltejasri\\Desktop\\teju2"+ ".txt");

		assertEquals("Line number 4 : hi\n", PatternSearch.findString(file,"hi"));
	}

}

