package iftest;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		double TotalSalary;
		String post;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your post");
		post = sc.next();
		
		switch(post) {
		case "md":
			TotalSalary = 300000 * 1.17;
			System.out.println("Your total salary is: Rs " +TotalSalary);
			break;
		case "ceo":
			TotalSalary = 257000*1.0875;
			System.out.println("Your total salary is: Rs " +TotalSalary);
			break;
		case "manager":
			TotalSalary = 80000*1.2;
			System.out.println("Your total salary is: Rs " +TotalSalary);
			break;
		case "helper":
			TotalSalary = 37500 * 1.1575;
			System.out.println("Your total salary is: Rs " +TotalSalary);
			break;
		default:
			System.out.println("Invalid input");
		}
		
		sc.close();
	}
}
