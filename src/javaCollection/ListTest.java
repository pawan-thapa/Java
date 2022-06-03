package javaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
public static void main(String[] args) {
	
	/*
	 * List<String> list = new ArrayList<>(); // Array List
	 */
	
	List<String> list = new LinkedList<>();
	
	
	list.add("Pawan");
	list.add("Thapa");
	list.add("Syangja");
	list.add("Kathmandu");
	list.add("Samjan");
	list.add("Karki");
	list.add("Bharatpur");
	
	list.remove(3); // removes kathmandu
	list.remove("Kathmandu"); // removes Kathmandu
	
	System.out.println(list.contains("US")); // searches for US and returns false if not found
	
	
	
	for(String s: list) {
		System.out.println(s);
	}
	
}
}
