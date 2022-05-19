package assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PoundsToKg {
	public static void main(String[] args) {
		float p;
		double k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight in pounds: ");
		p = sc.nextFloat();
		k = p/2.2046;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(+p+ " pound is "+df.format(k)+"kg");
		sc.close();
	}
}
