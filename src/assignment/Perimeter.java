package assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Perimeter {
	public static void main(String[] args) {
		String quad;
		double p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Whose perimeter are we calculating ?");
		quad = sc.next();
		switch(quad) {
		case "circle":
			double r;
			System.out.println("Enter the radius: ");
			r = sc.nextFloat();
			p= 2*Math.PI*r;
			DecimalFormat df = new DecimalFormat("#.##");
			System.out.println("The circumference of the circle with radius "+r+ " is: "+df.format(p));
			break;
		case "rectangle":
			double ln,br;
			System.out.println("Enter the length and breadth of rectangle: ");
			ln = sc.nextFloat();
			br = sc.nextFloat();
			p= 2*(ln+br);
			System.out.println("The perimeter of the rectangle is: "+p);
			break;
		case "triangle":
			double a,b,c;
			System.out.println("Enter all the sides of triangle: ");
			a = sc.nextFloat();
			b = sc.nextFloat();
			c = sc.nextFloat();
			p=a+b+c;
			System.out.println("The perimeter of the triangle is: "+p);
			break;
		default:
			System.out.println("Invalid input");
		}
		sc.close();
		
	}
}
