package day03.com.test;
class MyData {
	public int b;
}
public class MyClass2 {
	static void setValue(int a) { // int a = x
		a++;
	}
	static void setValue2(MyData c) { // MyData c = m;
		c.b++;
	}
	public static void main(String[] args) {
		int x = 0;
		setValue(x);
		System.out.println(x);
		MyData m = new MyData();
		m.b = 0;
		setValue2(m);
		System.out.println(m.b);
		
	}
}
