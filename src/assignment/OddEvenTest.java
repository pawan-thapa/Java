package assignment;

import java.util.Scanner;

public class OddEvenTest {
public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number: ");
	n = sc.nextInt();
	if(n%2==0) {
		System.out.println(n+" is even");
	}
	else {
		System.out.println(n+" is odd");
	}
	sc.close();
}
}
