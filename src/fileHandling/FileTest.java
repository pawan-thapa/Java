package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/pawan/desktop/Java.txt");
		
		System.out.println(file.isDirectory());
		System.out.println(file.exists());
		
		File dir = new File("/Users/pawan/desktop/3pmfiles");
		dir.mkdir();
		
		
		// list file names 
		String [] fileNames = dir.list();
		System.out.println(Arrays.toString(fileNames));
		
		
		
		// ======== list all the files from folder ===========
		
		File [] files = dir.listFiles();
		
		
		for(File fl : files) {
			
			FileInputStream f1 = new FileInputStream(fl.getAbsolutePath());
			
			int data;
			
			while ((data=f1.read()) != -1) {
				
				System.out.print((char)data);
				
			}
			
			
		}
	}
	
}
