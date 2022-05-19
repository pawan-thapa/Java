package assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Volume {
	public static void main(String[] args) {
		double v,r,h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius and height of cylinder: ");
		r = sc.nextDouble();
		h = sc.nextDouble();
		v = Math.PI*r*r*h;
		/* ----------- to reduce decimal to only two places-----------*/
		DecimalFormat df = new DecimalFormat("#.##"); 
		System.out.printf("Volume of the cylinder: " +df.format(v));
		sc.close();
	}
}
