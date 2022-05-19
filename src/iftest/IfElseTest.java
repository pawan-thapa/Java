package iftest;

import java.util.Scanner;

public class IfElseTest {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in); // reader is a variable and it links with keyboard
		System.out.println("Enter the first number: ");
		a = sc.nextInt();
		System.out.print("Enter the second number: ");
		b = sc.nextInt();
		if (a > b) {
			System.out.println(a + " is bigger");
		} else {
			System.out.println(b + " is greater");
		}
		
		sc.close();

	}
}
