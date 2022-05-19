package String;

public class PhoneValidation {
public static void main(String[] args) {
	String reg = "[0-9]{10}";
	
	/* ====== to check number with condition ========
	 * 
	 * to check starting with 98-----
	 * 
	 * String reg = "[9][8][0-9]{8}";
	 * 
	 * */
	String phone = "1234567890";
	System.out.println(phone.matches(reg));
}
}
