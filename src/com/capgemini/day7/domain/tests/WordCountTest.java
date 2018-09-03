package com.capgemini.day7.domain.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.WordCount;

class WordCountTest {

	@Test
	void test() throws IOException {
		File file= new File("C:\\Users\\ltejasri\\Desktop\\teju1.txt");
		//WordCount w1=new WordCount();
		assertEquals(4,  WordCount.wordCounts(file));
	}

}
