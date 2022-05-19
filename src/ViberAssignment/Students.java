package ViberAssignment;

import java.util.Scanner;

public class Students {
	String fname,lname,major;
	int year;
	void StudentDetails()
	{	
		System.out.println("\n\nStudent #1:\n");
		 System.out.println("First Name: "+fname);
		 System.out.println("Last Name: "+lname);
		 System.out.println("Major: "+major);
		 System.out.println("Admitted Year: "+year+"\n");
	}
 
	void StudentDetails2()
	{	
		System.out.println("\nStudent #2:\n");
		 System.out.println("First Name: "+fname);
		 System.out.println("Last Name: "+lname);
		 System.out.println("Major: "+major);
		 System.out.println("Admitted Year: "+year);
	}
 
 
public static void main(String[] args) {
	
	
	 
	 
	 Scanner sc = new Scanner(System.in);
	 Students s1 = new Students();
	     System.out.println("Enter your first name: ");
		 s1.fname = sc.next();
		 System.out.println("Enter your last name: ");
		 s1.lname = sc.next();
		 System.out.println("Enter your major: ");
		 s1.major = sc.next();
		 System.out.println("Enter your admitted year: ");
		 s1.year = sc.nextInt();
	 
	Students s2 = new Students();
		System.out.println("Enter your first name: ");
		 s2.fname = sc.next();
		 System.out.println("Enter your last name: ");
		 s2.lname = sc.next();
		 System.out.println("Enter your major: ");
		 s2.major = sc.next();
		 System.out.println("Enter your admitted year: ");
		 s2.year = sc.nextInt();
		 
		 sc.close();

	 s1.StudentDetails();
	 s2.StudentDetails2();
	
	 
	 
	 
	
}

 }
 

