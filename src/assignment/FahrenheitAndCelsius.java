package assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FahrenheitAndCelsius {
	public static void main(String[] args) {
		// F = 1.8 * C + 32
		// C = F-32 * 5/9 or .5556
		double C,F;
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your desired conversion "
				+ "\n Enter 1 for C-F or 2 for F-C:  ");
		ch = sc.nextInt();
		switch(ch) {
		case 1: 
			System.out.println("Enter the temperature in °C: ");
			C = sc.nextDouble();
			F = (1.8 * C) + 32;
			DecimalFormat df = new DecimalFormat("#.##");
			System.out.println("The corresponding temperature is: "+df.format(F)+"°F");
			break;
		case 2: 
			System.out.println("Enter the temperature in °F: ");
			F = sc.nextDouble();
			C = (F-32)*5/9;
			DecimalFormat cf = new DecimalFormat("#.##");
			System.out.println("The corresponding temperature is: "+cf.format(C)+"°C");
			break;
		default:
			System.out.println("Invalid Input");
		}
		sc.close();
		
		
		
		
	}
}
