package ViberAssignment;

import java.util.Scanner;

public class TwoStudents {
int roll;
String address;
double phone;
public static void main(String[] args) {
	TwoStudents s1 = new TwoStudents();
	TwoStudents s2 = new TwoStudents();
	Scanner sc = new Scanner(System.in);
	System.out.println("Hello Sam!!\nEnter your roll number: ");
	s1.roll = sc.nextInt();
	System.out.println("Enter your address: ");
	s1.address = sc.next();
	System.out.println("Enter your phone number: ");
	s1.phone = sc.nextDouble();
	System.out.println("\nHello John!!\nEnter your roll number: ");
	s2.roll = sc.nextInt();
	System.out.println("Enter your address: ");
	s2.address = sc.next();
	System.out.println("Enter your phone number: ");
	s2.phone = sc.nextDouble();
	sc.close();
	s1.printSam();
	s2.printJohn();
	
	

}
void printSam() {
	System.out.println("\nSam's Details: \nRoll number: "+roll);
	System.out.println("Address: "+address);
	System.out.println("Phone: "+phone);
	
	
}
void printJohn() {
	System.out.println("\nJohn's Details: \nRoll number: "+roll);
	System.out.println("Address: "+address);
	System.out.println("Phone: "+phone);
	
	
	
	
}
}
