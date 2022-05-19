package ExtraPractice;

import java.util.Scanner;

/*
 *  Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
 */

public class Employee {
	
	int salary;
	int hours;

	
	

	  void getInfo(int s, int h) {
		 
		  salary = s;
		  hours  = h;

	}
//	  void AddBoth() {
//			 if(salary<500 && hours > 6)
//			  {
//				  salary=salary + 15;
//					System.out.println("\nCongratulations !!! You qualify for both the rewards of $10 and $5. \nFinal Salary is $" + salary);
//			  }
//			 else {
//				 
//			 }
//			 
//		 
////		
////		
//	}

	  void AddSal( ){
		  
		  if(salary < 500) {
			  salary=salary + 10;
			  System.out.println("\nCongratulations !!! You have been rewarded with $10. \nFinal Salary is $" + salary);
		  }
		  else {
			  
		  }
	  }
		  
		

	  void AddWork() {
		  AddSal();
		  if (hours > 6) {
			  salary=salary + 5;
//			  
				System.out.println("\nCongratulations !!! You have been rewarded with $5. \nFinal Salary is $" + salary);
			}
		  
		  else {
				System.out.println("\nSorry your credentials donot qualify for salary addition.");
			}
	  }	  
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		int s, h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		s = sc.nextInt();
		System.out.println("Enter your working hours: ");
		h = sc.nextInt();
		e.getInfo(s,h);
//		e.AddBoth();
//		e.AddSal( );
		e.AddWork();
		
		
		 
		sc.close();

	}
}
