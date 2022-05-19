package ExtraPractice;

/*
 * =========== Write a program that would print the information (name, year of joining, salary, address) of 
 * three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat
 * 
 */




public class Employees {
	int year;
	String name;
	String add;
	

 void print() {
	
	System.out.println(name+" \t "+year+" \t \t\t"+add);

}
 
 public static void main(String[] args) {
		Employees e1 = new Employees();
		Employees e2 = new Employees();
		Employees e3 = new Employees();
		e1.name = "Robert";
		e1.year = 1994;
		e1.add = "64C- WallsStreet";
		e2.name = "Sam";
		e2.year = 2000;
		e2.add = "68D- WallsStreet";
		e3.name = "John";
		e3.year = 1999;
		e3.add = "26B- WallsStreet";
		
		System.out.println("Name \t Year of joining\tAddress");
		e1.print();
		e2.print();
		e3.print();
		
	}


}
