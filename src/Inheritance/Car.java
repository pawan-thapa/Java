package Inheritance;

public class Car extends Vehicle{
	private int cc;
	private int gears;
	
	public void attributesCar() {
		System.out.println("Speed of car: "+speed);
		System.out.println("Size of car is: "+size);
		System.out.println("CC of car is: "+cc);
		System.out.println("No of gears in car: "+gears);
		
		super.attributes();
	}
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.speed = 200;
		c1.size = 22;
		c1.cc = 2000;
		c1.gears = 6;
		c1.attributes();
		c1.attributesCar();
		
	}
}
