package assignment;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	int product=1,i,n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Whose factorial to compute: ");
	n= sc.nextInt();
	for(i=1;i<=n;i++)
	{
		product = product*i;
		sc.close();
	}
	System.out.println("Factorial of "+n+ ": "+product);
	
}
}

