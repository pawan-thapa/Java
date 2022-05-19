package assignment;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	String ch;
	int a,b,sum,diff,prd,div,rem;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your required operator in form of its sign (+.-.*,/): ");
	ch = sc.next();
	switch(ch)
	{
	case "+":
		System.out.println("Enter any two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		sum = a+b;
		System.out.println("The final sum is: "+sum);
		break;
	case "-":
		System.out.println("Enter the subtrahend: ");
		a = sc.nextInt();
		System.out.println("Enter the subtractor: ");
		b = sc.nextInt();
		diff = b-a;
		System.out.println("The difference is: "+diff);
		break;
	case "*":
		System.out.println("Enter any two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		prd = a*b;
		System.out.println("The final product is: "+prd);
		break;
	case "/":
		System.out.println("Enter the dividend: ");
		a = sc.nextInt();
		System.out.println("Enter the divisor: ");
		b = sc.nextInt();
		div = a/b;
		rem = a%b;
		System.out.println("Quotient = "+div+ 
				" \n Remainder = "+rem);
		break;
	default:
		System.out.println("Invalid input");
		
	sc.close();
		}
}
}
