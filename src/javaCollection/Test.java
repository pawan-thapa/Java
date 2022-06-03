package javaCollection;

import java.util.LinkedList;
import java.util.List;

public class Test {
public static void main(String[] args) {
	
	List<Book> b = new LinkedList<>();
	
	Book b1 = new Book();
	Book b2 = new Book();
	Book b3 = new Book();
	
	
	
	b1.setPrice(600);
	b1.setAuthor("Rabindra Nath Tagore");
	b1.setPublication("ABC");
	b1.setName("Rome");
	
	b.add(b1);
	
	b2.setAuthor("William Shakespeare");
	b2.setName("Hollywood");
	b2.setPrice(900);
	b2.setPublication("XYZ");
	
	b.add(b2);
	
	b3.setAuthor("Laxmi Prasad Devkota");
	b3.setName("Muna Madan");
	b3.setPrice(2400);
	b3.setPublication("RTY");
	
	b.add(b3);
	
	
	System.out.println(b);
	
	
	
	
}
}
