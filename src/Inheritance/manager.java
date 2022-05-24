package Inheritance;

public class manager extends Member{
	String specialization;
	
	public static void main(String[] args) {
		manager M = new manager();
		M.name = "Isha Bhandari";
		M.age = 22;
		M.phone = "9842979012";
		M.salary = 200000;
		M.address = "Pepsicola";
		M.specialization = "Java";
		M.printSalary();
		
		
	}
}
