package MethodOverriding;

public class Test {
	
public static void main(String[] args) {
	Test t = new Test();
	EverestBank E = new EverestBank();
	PrabhuBank P = new PrabhuBank();
	GarimaBikas G = new GarimaBikas();
	
	System.out.println("Bank Name: "+E.getName());
	System.out.println("Interest Rate: "+E.getInterestRate());

	System.out.println("\nBank Name: "+P.getName());
	System.out.println("Interest Rate: "+P.getInterestRate());
	
	System.out.println("\nBank Name: "+G.getName());
	System.out.println("Interest Rate: "+G.getInterestRate());
	
	
	
	// Upcasting - store the object of child in parent is called upcasting.
	 
		CentralBank b = new EverestBank();
		
		
		

	
}

	// Dynamic or Late Binding of object or runtime polymorphism 	

		void PrintBankInfo(CentralBank c) {
			System.out.println("Bank Name: "+c.getName());
			System.out.println("Interest Rate: "+c.getInterestRate());
		}

}
