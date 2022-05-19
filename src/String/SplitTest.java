package String;

public class SplitTest {
public static void main(String[]args) {
	String s = "Java Developers in Nepal";
	String[] words =s.split("\\s");  // regex
	int cnt = 0;
	for(String w : words)
	{
		System.out.println(w);
		
		
		if(w.equalsIgnoreCase("nepal")) {
			cnt++;
		}
		
		
	}
	System.out.println(cnt);
}

}
