package String;


// ======== Regex used for input validation ================

public class RegexTest {
 public static void main(String[]args) {
	 String reg1 = "[0-9]";  // [0-9]+ for multi-digit number
	 String value = "4";
	 System.out.println(value.matches(reg1));
 }
}
