// =========== Sum and Average Class ================


package method;

import java.util.Scanner;

public class MethodWithScanner {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	System.out.println("Enter any two numbers: ");
	a = sc.nextInt();
	b = sc.nextInt();
	int sum = sum(a,b);
	Average(sum);
	sc.close();

}

static int sum(int a, int b) {

	int s = a + b;
	return s;
}

public static void Average(int sum) {
	float avg = (float)sum/2;
	System.out.println("Average = " +avg);
}

}

// 