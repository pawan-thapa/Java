package looping;

public class EnhancedForLoop {
/* used to read data from collection(array,linked-list,etc)
 * syntax:
 * 		for(datatype var: array)
 * {
 * --------------------
 * ---------statements
 * }
 * 
 */
	public static void main(String[] args) {
		int data[]= {10,20,30,40,50,60,70,80,90,100};
		int sum=0;
		
		for( int x: data)
		{
			sum = sum + x;
			
			
		}
		System.out.println("Total Sum: " + sum);
		}
	}

