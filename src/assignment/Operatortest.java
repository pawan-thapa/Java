package assignment;

import java.util.Scanner;

public class Operatortest {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		a= sc.nextInt();
		b= sc.nextInt();
		System.out.println("When a="+a+" and b="+b);
		if(a<b) {
			System.out.println("\nb is greater");
		}
		else if(a>b) {
			System.out.println("\na is greater");
		}
		else {
			System.out.println("\nThe two numbers are equal");
		}
		sc.close();
	}
}
