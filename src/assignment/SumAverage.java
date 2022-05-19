package assignment;

import java.util.Scanner;

public class SumAverage {
	public static void main(String[] args) {
		float a,b;
		float sum, avg;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter any two numbers: ");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		sum = a + b;
		avg = sum/2;
		
		System.out.println("Sum: "+sum);
		System.out.println("Average of these two numbers: "+avg);
		
	}
}
