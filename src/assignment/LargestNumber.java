package assignment;

import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args) {
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any three numbers: ");
	a= sc.nextInt();
	b= sc.nextInt();
	c= sc.nextInt();
	if(a>=b && a>=c)
	{
		System.out.println(a+" is greatest of all");
	}
	else if(b>=a && b>=c)
	{
		System.out.println(b+" is greatest of all");
	}
	else {
		System.out.println(c+" is greatest of all");
	}
	sc.close();
}
}
