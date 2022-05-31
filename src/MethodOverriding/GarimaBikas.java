package MethodOverriding;

public class GarimaBikas extends CentralBank{

	@Override
	protected String getName() {
		
		return "Garima Bikas Bank" ;
	}
	
	@Override
	protected int getInterestRate() {
		
		return 18;
	}
	
}
