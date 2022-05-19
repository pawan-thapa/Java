package looping;

/*
 * 1. break - exit from loop
 * 2. continue - skip values
 * 3. return - exit from values
 */

public class Jumping {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			
//			if(i==5) {
//				break;   -------- breaks the loop
//			}
			
//			if(i==5) {
//				continue; -------- skips 5 from the loop
//			}
			if(i==5) {
				return; /*ends the main method prints only up to 4 without last line*/
			}
			System.out.println(i);
		
		}
		System.out.println("For loop ended");
		}
	}

