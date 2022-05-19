package method;

import java.util.Scanner;

public class CompoundInterest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the principal amount: ");
	double P= sc.nextDouble();
	System.out.println("Enter the number of years: ");
	double T= sc.nextDouble();
	System.out.println("Enter the rate: ");
	double R= sc.nextDouble();
	double SI = SimpleInterest(P,R);
	NextYears(SI,T);
	sc.close();
}
 static double SimpleInterest(double P, double R)
 {
	double SI = P*R;
	return SI;
 }
 
 public static void NextYears(double SI, double T) {
	 System.out.println("Years \tFutureValue ");
	for(int i=1;i<=T;i++) {
		double FinalValue = SI * i;
		System.out.println(i+"\t"+FinalValue);
	}
	
	 
	}






}
