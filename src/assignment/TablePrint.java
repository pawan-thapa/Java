package assignment;

import java.util.Scanner;

public class TablePrint {
public static void main(String[] args) {
	int i,prd,n,d;
	Scanner sc = new Scanner(System.in);
	System.out.println("Which number's multiplication table to print? ");
	n = sc.nextInt();
	System.out.println("Upto which should the multiplication table be printed? ");
	d = sc.nextInt();
	for(i=1;i<=d;i++)
	{
		prd = n*i;
		System.out.println(n+" * "+i+" = "+prd);
		sc.close();	
	}
	
}
}
