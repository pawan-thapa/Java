package assignment;

import java.util.Scanner;


public class Area {
	public static void main(String[] args) {
		String quad;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Whose area are we calculating ?");
		quad = sc.next();
		switch(quad) {
		case "circle":
			double r;
			System.out.println("Enter the radius: ");
			r = sc.nextFloat();
			area= Math.PI*r*r;
			System.out.println("The area of the circle with radius "+r+ " is: "+area);
			break;
		case "rectangle":
			double l,b;
			System.out.println("Enter the length and breadth of rectangle: ");
			l = sc.nextFloat();
			b = sc.nextFloat();
			area= l*b;
			System.out.println("The area of the rectangle is: "+area);
			break;
		case "triangle":
			double base,h;
			System.out.println("Enter the base and height of triangle: ");
			base = sc.nextFloat();
			h = sc.nextFloat();
			area= h*base/2;
			System.out.println("The area of the triangle is: "+area);
			break;
		default:
			System.out.println("Invalid input");
		}
		sc.close();
		
	}
}
