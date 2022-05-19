package assignment;

import java.util.Scanner;

public class PersonDetails {
public static void main(String[] args) {
	String name,nat;
	int roll;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name: ");
	name = sc.nextLine(); /* --- to accept spaces in string------------*/
	System.out.println("Enter your roll: ");
	roll = sc.nextInt();
	System.out.println("Enter your nationality: ");
	nat = sc.next();
	
	System.out.println("\nHi your details are as follows: \n"
			+ "\nName: "+name+"\nRoll: "+roll+ "\nNationality: "+nat);
	sc.close();
}
}
