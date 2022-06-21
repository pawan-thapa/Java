package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("/Users/pawan/Desktop/Java.txt");
		
		int data;
		
		while ((data=file.read()) != -1) {
			
			System.out.print((char)data);
			
		}
		
	}
	
}
