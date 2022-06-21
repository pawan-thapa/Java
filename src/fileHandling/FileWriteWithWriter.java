package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteWithWriter {

	/*
	 * 
	 * ================== to process text or docs file =================
	 * 
	 * 1. FileWriter : file write
	 * 2. FileReader : file read
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("/Users/pawan/desktop/employee.txt",true);  // when true is done, existing data will not be replaced by the
		// newer one but instead will be appended with the previous one
		
		file.write("Id = 345");
		file.write(System.lineSeparator());  // break a line
		file.write("Name = Pawan Thapa");
		file.write(System.lineSeparator());
		file.write("Age = 25");
		file.write(System.lineSeparator());
		file.write("City = Syangja");
		
		file.close();
		
		System.out.println("Employee file created");
		
		
	}
	
}
