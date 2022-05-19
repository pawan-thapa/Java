package assignment;

import java.util.Scanner;

public class NumberSwap {
 public static void main(String[] args) {
	int a,b,temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any two numbers: ");
	a = sc.nextInt();
	b= sc.nextInt();
	System.out.println("Numbers before swapping: a="+a+ " and b=" +b );
	temp=a;
	a=b;
	b=temp;
	System.out.println("Numbers after swapping: a="+a+ " and b=" +b);
	sc.close();
}
}
