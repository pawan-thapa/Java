package iftest;

import java.util.Scanner;

public class LadderTest {
	public static void main(String[] args) {
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		marks = sc.nextInt();

		if (marks >= 80) {
			System.out.println("Distinction");
		} else if (marks >= 6) {
			System.out.println("First Division");
		} else if (marks >= 50) {
			System.out.println("Second Division");
		} else if (marks >= 35) {
			System.out.println("Third Division");
		} else {
			System.out.println("Sorry you failed");
		}
		sc.close();

	}

}
