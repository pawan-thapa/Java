

package Abstraction;

public abstract class CentralBank {
	
	protected abstract String getName();
	
	protected abstract int getInterestRate(); 
	
	public void moneyExRate() {
		System.out.println("$1 = NRs 124");
		System.out.println("10 Yen = NRs 10");
		System.out.println("1 KDD = NRs 15");
	}
}