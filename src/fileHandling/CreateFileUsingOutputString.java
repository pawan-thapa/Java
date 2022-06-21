package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.ClosedFileSystemException;

public class CreateFileUsingOutputString {

	/*  =========== To read all general files =======
	 * 
	 * 1. FileInputStream === file read
	 * 
	 * 2. FileOutputStream === file write
	 * 
	 */
	
	
	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream file = new FileOutputStream("/Users/pawan/Desktop/Java.txt");
			
		file.write("Hello Guys".getBytes());
		
		file.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
