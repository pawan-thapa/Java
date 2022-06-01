package Abstraction;

public class Test {

	public static void main(String[] args) {
		
		CentralBank b = new NabilBank();
		
		System.out.println("Bank Name: "+b.getName());
		System.out.println("Interest Rate: "+b.getInterestRate());
		
		UserService U = new UserServiceImpl();
		
		U.addUser();
		U.deleteUser();
}
}
