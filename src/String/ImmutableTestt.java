package String;

public class ImmutableTestt {
	/* ============= Immutable =================
	# we cannot change or modify the original value/state of object
	  at runtime is known as immutable object.
	*/


	    public static void main(String[] args) {
	        
	        // ====== Immutable Object ============
	        String s = "Hello";
	        s.concat(" Ram"); // immutable object s-----so Hello only printed
	        System.out.println(s);
	        
	        s = s.concat(" Ram");
	        System.out.println(s);
	        
	        
	        // ======== Mutable Object ============
	        
	        StringBuffer sb = new StringBuffer("Hello");
	        sb.append(" Ram");
	        
	        System.out.println(sb);
	    }
	}

