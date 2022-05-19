package ViberAssignment;

public class Rectangle {
	int length,breadth;
	void area() 
	{
		int area;
		area = length*breadth;
		System.out.println("Area is: "+area );
	}
	
	void perimeter()
	{
		int perimeter;
		perimeter = 2*(length+breadth);
		System.out.println("Perimeter is: "+perimeter );
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.length = 7;
		r.breadth = 8;
		r.area();
		r.perimeter();
	}
}
