package assignment;

import java.util.Scanner;

public class NegativePrint {
public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of n: ");
	n = sc.nextInt();
	if(n<0) {
		System.out.println("n= "+n);
	}
	else {
		System.out.println("\nSorry pal ! We only print negative numbers.");
	}
	
	sc.close();		
}
}
