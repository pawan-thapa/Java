package assignment;

import java.util.Scanner;

public class SumToNth {
public static void main(String[] args) {
	int sum=0,i,n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number upto which you want the sum: ");
	n= sc.nextInt();
	for(i=1;i<=n;i++)
	{
		sum = sum+i;
		sc.close();
	}
	System.out.println("Sum of numbers from 1 to "+n+ ": "+sum);
	
}
}
