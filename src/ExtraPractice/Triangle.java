package ExtraPractice;


/* 
 *  ======== Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
 *  by creating a class named 'Triangle' with three parameters in its constructor.
 * */

// ========= How to convert integer value to float within a program =====================

public class Triangle {
	
	int a,b,c;
	
	Triangle(int x, int y, int z) {
		a= x;
		b=y;
		c=z;
	}
	
	void perimeter() {
		int p = a+b+c;
		System.out.println("Perimeter of triangle: "+p);
	}
	
	void area() {
		int p = a+b+c;
		int s = p/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle: "+area);
		
	}
	
	
	
public static void main(String[] args) {
	Triangle t = new Triangle(3, 4, 5);
	t.perimeter();
	t.area();
}
}
