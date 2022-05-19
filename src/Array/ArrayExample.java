package Array;

import java.util.Scanner;

public class ArrayExample {
public static void main(String[] args) {
	String book[] = new String[5];
	int price[] = new int[5];
	int sum = 0;
	 float avg = 0;
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<price.length;i++) 
	{
		System.out.println("Enter the book name: ");
		book[i] = sc.next();
		System.out.println("Enter its price: ");
		price[i]= sc.nextInt();
		
	}
	for(int i=0;i<price.length;i++) 
	{
		 System.out.println("Price of "+book[i]+ " is: Rs."+price[i]);
	}
	
	 for(int i=0; i<price.length;i++)
	 {
		 
		 sum =sum + price[i];
		 avg = (float)sum/5;
		 
	 }
	 
	 System.out.println("\nTotal sum of 5 books: Rs."+sum+"\n& average price is: "+avg);
	 sc.close();
}

}
