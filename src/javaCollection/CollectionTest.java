package javaCollection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(87,987,334,68,89,987,456,435,568,657,56);
	Collections.sort(list); // ascending order
	
	System.out.println(list);
	
	Collections.sort(list,Collections.reverseOrder()); // Descending order
	System.out.println(list);
}
}
