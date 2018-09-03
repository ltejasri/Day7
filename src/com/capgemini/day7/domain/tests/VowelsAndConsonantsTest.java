package com.capgemini.day7.domain.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.VowelsAndConsonants;

class VowelsAndConsonantsTest {

	@Test
	void testVowelsAndConsonants() throws IOException {
		File file = new File("C:\\Users\\ltejasri\\Desktop\\teju1.txt");
		assertEquals("Number of vowels = 10\nNumber of consonants = 13", VowelsAndConsonants.findVowelAndConsonant(file));
	}

}
