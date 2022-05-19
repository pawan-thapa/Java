package assignment;

import java.util.Scanner;

public class DayPrint {
public static void main(String[] args) {
	int d;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number from 1-7: ");
	d = sc.nextInt();
	switch(d)
	{
	case 1:
		System.out.println("The corresponding day of the week is Sunday");
		break;
	case 2:
		System.out.println("The corresponding day of the week is Monday");
		break;
	case 3:
		System.out.println("The corresponding day of the week is Tuesday");
		break;
	case 4:
		System.out.println("The corresponding day of the week is Wednesday");
		break;
	case 5:
		System.out.println("The corresponding day of the week is Thursday");
		break;
	case 6:
		System.out.println("The corresponding day of the week is Friday");
		break;
	case 7:
		System.out.println("The corresponding day of the week is Saturday");
		break;
	default:
		System.out.println("Invalid input");
		
	sc.close();
	}
	
}
}
