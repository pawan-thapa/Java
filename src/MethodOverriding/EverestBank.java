package MethodOverriding;

public class EverestBank extends CentralBank{
	
	@Override
	protected String getName() {
		
		return "Everest Bank Ltd";
	}
	
	@Override
	protected int getInterestRate() {
		
		return 15;
	}
	
	
}
