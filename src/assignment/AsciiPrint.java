package assignment;

import java.util.Scanner;

public class AsciiPrint {
public static void main(String[] args) {
	int i;
	char con;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number from 0-128: ");
	i = sc.nextInt();
	if(i<=128) {
		con = (char)i;
		System.out.println(i+" => "+con);	
	}
	else {
		System.out.println("Enter values only from 0-128");
	}
	sc.close();
}
}
