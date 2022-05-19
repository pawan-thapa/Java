package Constructor;

import java.util.Scanner;

public class User {

	String username;
	String password;

// best practice is to make a default constructor even though we are making a parameterized constructors 

// ========= Default constructor =======

//		User() {
//			username = "test";
//			password = "123";
//		}

// =========== Parameterized Constructor ==========

	User(String un, String pwd) {
		username = un;
		password = pwd;
	}

	void printData() {
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String uname = sc.next();
		System.out.println("Enter password: ");
		String psw = sc.next();

		User u1 = new User(uname, psw);

		u1.printData();
		sc.close();
	}

}
