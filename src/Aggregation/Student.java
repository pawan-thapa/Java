package Aggregation;

public class Student {
	private int id;
	private String name;
	private String address;
	
	private Bike b; // has a relationship defined here as Student has a bike
	
	public Bike getB() {
		return b;
	}
	public void setB(Bike b) {
		this.b = b;
	}
	public static void main(String[] args) {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
