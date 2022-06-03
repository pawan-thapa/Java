package javaCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	/*
	 * a. HashSet
	 * b. TreeSet
	 * c. LinkedHashSet
	 * 
	 */
	public static void main(String[] args) {
		// Set<String> hset = new HashSet<>();   // HSet for unique data set 
		
		// Set<String> hset = new TreeSet<>();  // TreeSet for unique data set arranged in sorting order 
		
		Set<String> hset = new LinkedHashSet<>(); // Returns data set in the same order as the data set have been put
		
		hset.add("Java");
		hset.add("SQL");
		hset.add("JAVA");
		hset.add("Android");
		hset.add("PhP");
		hset.add("Python");
		hset.add("SQL");
		
		for(String s: hset) {
			System.out.println(s);
		}
	}
	
}
