package day02.com.test2;

class MyData2 {
	static int i;
	static int myMethod(int a) {
		int c = i + a;
		return c;
	}
}

class Counter {
	private int i;
	public Counter() {
		i++;
	}
	public int getValue() {
		return i;
	}	
}
public class MyClass3 {
	public static void main(String[] args) {
//		MyData2.i = 100;
//		MyData2.myMethod(10);
		Counter c = new Counter();
		System.out.println(c.getValue());

	}

}
