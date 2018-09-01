package com.capgemini.day7.domain;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Linecount {
	public int countlinesInFile(String fileLocation) throws IOException {
		int count=0;
		FileReader fr=new FileReader(fileLocation);
		BufferedReader reader;
		reader=new BufferedReader(fr);
		while(reader.readLine()!=null)
			count++;
		return count;
	}
}
