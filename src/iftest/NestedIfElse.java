package iftest;


import java.util.Scanner;

public class NestedIfElse {
// --------- Nested if-else -----------
	public static void main(String[] args) {

		String citizen;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your citizenship");
		citizen = sc.next();
		
		System.out.println("Enter your age");
		age = sc.nextInt();

		if (citizen.equals("nepali")) {

			if (age >= 18) {
				System.out.println("Congratulations!! You can vote.");
			} else {
				System.out.println("Sorry You are underage.");
			}

		} else {
			System.out.println("Sorry You are ineligible to vote.");
		}
		sc.close();
	}
}