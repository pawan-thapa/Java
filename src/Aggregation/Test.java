package Aggregation;

public class Test {
public static void main(String[] args) {
	
	Bike b = new Bike();
	b.setPrice(650000);
	b.setCc(350);
	b.setColor("Green");
	b.setGears(6);
	b.setModel("Royal Enfield");
	
	Student s = new Student();
	s.setId(101);
	s.setName("Pawan Thapa");
	s.setAddress("Syangja");
	
	s.setB(b);
	
	System.out.println("\nStudents details with Bike \n");
	System.out.println("Student's Id: "+s.getId());
	System.out.println("Student's Name: "+s.getName());
	System.out.println("Address: "+s.getAddress());
	System.out.println("Bike Model: "+s.getB().getModel());
	System.out.println("Bike Price: "+s.getB().getPrice());
	System.out.println("Bike CC: "+s.getB().getCc());
	System.out.println("Bike Color: "+s.getB().getColor());
	System.out.println("Number of gears in bike: "+s.getB().getGears());
	
	
}
}
