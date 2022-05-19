package looping;

public class SumEven {
	public static void main(String[] args) {
		int evesum = 0, oddsum = 0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				evesum = evesum + i;
			}
			else {
				oddsum = oddsum + i;
			}
		}
		System.out.println("Sum of first 100 even numbers: " + evesum);
		System.out.println("Sum of first 100 odd numbers: " + oddsum);
	}
}
