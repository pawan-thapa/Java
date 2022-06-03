package javaCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	
	
public static void main(String[] args) {
	
	// Map<String,Integer> hmap = new HashMap<>();  random value as output 
	 
	 // Map<String,Integer> hmap = new TreeMap<>();  order ma output dine on the basis of key
	
	Map<String,Integer> hmap = new LinkedHashMap<>(); // output in the same order as put in input
	
	hmap.put("Pawan", 25);
	hmap.put("Hari", 50);
	hmap.put("Shanta", 48);
	hmap.put("Prabha", 23);
	
	for(String key : hmap.keySet()) {
		System.out.println(key+" = "+hmap.get(key));
	}
}
}
