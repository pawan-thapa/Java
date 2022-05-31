package MethodOverriding;

public class CentralBank {
	
	protected String getName(){
		
		return "Central Bank";
		
	}
	
	protected int getInterestRate() {
		
		return 0;
	}
	
	public void moneyExRate() {
		System.out.println("$1 = NRs 124");
		System.out.println("10 Yen = NRs 10");
		System.out.println("1 KDD = NRs 15");
	}
}

