package Encapsulation;

public class Test {
public static void main(String[] args) {
	Customer c = new Customer();
	
	c.setAge(55);
	c.setFname("Hari");
	c.setLname("Thapa");
	c.setId(555);
	c.setPhone("9876545789765");
	
	
	System.out.println(c);
	// this prints the value of class with one line of code
	// Output as : 
	// Customer [id=555, fname=Hari, lname=Thapa, age=55, phone=9876545789765]
	

/*
	System.out.println("Id= "+c.getId());
	System.out.println("First Name= "+c.getFname());
	System.out.println("Last Name= "+c.getLname());
	System.out.println("Age= "+c.getAge());
	System.out.println("Phone= "+c.getPhone());
	
*/
	
}
}
