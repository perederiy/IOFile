package org.itstep;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class IODataTest {

	@Test
	public void readDataFromFile() {
		String filePath = "E:\\test\\foto.jpg";
		IOData iOData = new IOData();
		byte[] massiv = iOData.readDataFromFile(filePath);
		assertTrue(massiv.length > 0);
	}
	
	@Test
	public void readTextFromFile() {
		String filePath = "E:\\test\\test.txt";
		String text = IOData.readTextFromFile(filePath);
		assertNotNull(text);
	}
	
	@Test(expected = Exception.class)
	public void readDataFromFileExeption(){
		String filePath = null;
		IOData iOData = new IOData();
		iOData.readDataFromFile(filePath);
	}
	
	@Test(expected = Exception.class)
	public void readTextFromFileExeption(){
		String filePath = null;
		IOData.readTextFromFile(filePath);
	}

}
