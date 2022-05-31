package MethodOverriding;

public class PrabhuBank extends CentralBank{

	@Override
	protected String getName() {
		
		return "Prabhu Bank";
	}
	
	@Override
	protected int getInterestRate() {
		
		return 20;
	}
	
	
	
}
