package Inheritance;

public class Employeee extends Member{
	String department;
	public static void main(String[] args) {
		Employeee E = new Employeee();
		E.name = "Pawan Thapa";
		E.age = 25;
		E.phone = "9860350910";
		E.address = "Imadol";
		E.salary = 250000;
		E.department = "IT";
		E.printSalary();
		
	}
	
}
