package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFIleUsingReader {
	
	
public static void main(String[] args) throws IOException {
	
	FileReader file = new FileReader("/Users/pawan/desktop/excel.csv");
	
	BufferedReader buffer = new BufferedReader(file);
	
	String line;
	
	while ((line = buffer.readLine()) != null) {
		
		System.out.println(line);
	}
	
}
}
