package assignment;

import java.util.*;

public class Simpleinterest {
	public static void main(String[] args) {
		double t,r,SI;
		long P;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle: ");
		P = sc.nextInt();
		System.out.println("Enter the time(in years): ");
		t = sc.nextFloat();
		System.out.println("Enter the rate: ");
		r = sc.nextFloat();
		
		SI = P*t*r/100;
		System.out.println("Simple Interest: " +SI);
		sc.close();
	}
	
	
}
