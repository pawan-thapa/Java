package MethodOverloading;


// Overloading with different arguments 

public class Calculation {
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	void sum(int a,int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		Calculation obj = new Calculation();
		obj.sum(5, 6);
		obj.sum(5,6,7);
	}
}
