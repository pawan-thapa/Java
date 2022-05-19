package assignment;

import java.util.Scanner;

public class TriangleTest {
public static void main(String[] args) {
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the three sides of triangle: ");
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	if(a==b && b==c) {
		System.out.println("Equilateral Triangle");
	}
	else if(a==b || a==c || b==c) {
		System.out.println("Isosceles triangle");
	}
	else {
		System.out.println("Scalene triangle");
	}
	sc.close();
}
}
