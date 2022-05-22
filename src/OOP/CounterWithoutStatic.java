package OOP;

public class CounterWithoutStatic {
int count = 0;
public CounterWithoutStatic() {
	count++;
}
private void showCount() {
	System.out.println(count);
}
public static void main(String[] args) {
	new CounterWithoutStatic().showCount();
	new CounterWithoutStatic().showCount();
	new CounterWithoutStatic().showCount();
}

}
