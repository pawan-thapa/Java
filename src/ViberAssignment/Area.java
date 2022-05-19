package ViberAssignment;

import java.util.Scanner;

/*
 * Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
         *     First method named as 'setDim' takes length and breadth of rectangle as parameters
         *     and the second method named as 'getArea' prints the area of the rectangle.
         *     Length and breadth of rectangle are entered through keyboard.    
 */

public class Area {

	int len;
	int bred;

	void setDim(int l, int b) {
		len = l;
		bred = b;
	}

	void printArea() {

		int a = len * bred;

		System.out.println("The area of rectangle is: " + a);
	}

	public static void main(String[] args) {

		Area A = new Area();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth of rectangle");
		int l = sc.nextInt();
		int b = sc.nextInt();
		A.setDim(l, b);
		A.printArea();

		sc.close();

	}

}
