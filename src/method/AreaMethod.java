package method;

public class AreaMethod {
public static void main(String[] args) {
	int area = getArea(6, 5);
	Volume(area, 7);
	
	}

static int getArea(int l, int b) {
	int a = l*b;
	return a;
}

public static void Volume(int area, int h) {
	int v = area * h;
	System.out.println("Area = "+area);
	System.out.println("Volume = "+v);
}
}
