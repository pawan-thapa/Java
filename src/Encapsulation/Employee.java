package Encapsulation;

public class Employee {
	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	public void SetName(String name) {
		
	}
	public void raiseSalary(double increase) {
		
	}
	
	/*
	 *  ===== Replace the no-arg constructor in Employee with a constructor that takes empId, name, ssn, and salary. ====
	 */
	
	Employee(int empId,String name,int ssn,String salary) {
		
		
	}
	
	/*
	 * Add a method named printEmployee to print the Employee object details.
	 */
	void PrintEmployee() {
		System.out.println("Employee ID: "+empId);
		System.out.println("Name of employee: "+name);
		System.out.println("Serial number: "+ssn);
		System.out.println("Salary: "+salary);
	}
	
	/*
	 * Remove all the setter methods except setName.
	 */
	
	public int getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
}
