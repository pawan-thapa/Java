package String;

public class ImmutableTest {
	/* ===== String =======
	# collection/array of characters is called string.
	# String is class in Java
	# use to create and process String. 
	*/

	    public static void main(String[] args) {
	       
	       String s = "java developers in nepal";
	       
	       System.out.println(s.length());
	       System.out.println(s.toUpperCase());
	       System.out.println(s.toLowerCase());
	       
	       // substring 
	       
	       System.out.println(s.substring(5,15));
	       System.out.println(s.substring(5,24));
	       System.out.println(s.substring(5));
	       
	       
	    }
	}

