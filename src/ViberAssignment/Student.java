package ViberAssignment;

import java.util.Scanner;

public class Student {
	String name;
	int rollno;
public static void main(String[] args) {
	
	Student s = new Student();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name: ");
	s.name = sc.nextLine();
	System.out.println("Enter your roll number: ");
	s.rollno = sc.nextInt();
	sc.close();
	 System.out.println("\nStudent Name: "+s.name+"\nRoll number: "+s.rollno);	
	
}
}
